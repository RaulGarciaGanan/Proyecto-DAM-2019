CREATE OR REPLACE PACKAGE BODY gest_depart AS
  -- Función privada 
  FUNCTION  buscar_depart_por_nombre  
	  (p_nom_dep VARCHAR2)
	  RETURN NUMBER;

PROCEDURE insert_depart(
	p_nom_dep VARCHAR2,
	p_loc VARCHAR2)
 AS
	v_ultimo_dep DEPART.DEPT_NO%TYPE;
	e_nombre_repetido EXCEPTION;
 BEGIN
 -- Comprobar dpt repetido(Puede disparar NO_DATA_FOUND)
  	DECLARE
	  v_nom_dep depart.DNOMBRE%TYPE; 
	  e_nombre_repetido EXCEPTION;
	BEGIN
	  SELECT dnombre INTO v_nom_dep FROM depart
		WHERE upper(dnombre) = UPPER(p_nom_dep);
      RAISE insert_depart.e_nombre_repetido;  
	EXCEPTION
	  WHEN NO_DATA_FOUND THEN
	    NULL;
	  WHEN TOO_MANY_ROWS THEN
	    RAISE insert_Depart.e_nombre_repetido;
	END;		
  --	Fin del bloque de comprobación de departamento repetido 

-- Calcular el número de departamento e insertar 
    SELECT MAX(DEPT_NO) INTO v_ultimo_dep FROM DEPART;
	-- Como hay una funcion de grupo no funciona la exception NO_DATA_FOUND
	IF v_ultimo_dep IS NULL
	THEN
		--Si la tabla departamento esta vacia, es decir, no hay ningun departamento
		INSERT INTO DEPART VALUES (10,upper(p_nom_dep),upper(p_loc));
    ELSE
		INSERT INTO DEPART VALUES ((TRUNC(v_ultimo_dep, -1) +10), p_nom_dep,p_loc);
	END IF;
        COMMIT;
 EXCEPTION
  WHEN e_nombre_repetido THEN
    RAISE_APPLICATION_ERROR ('-20001','Err. Nombre de departamento duplicado');

END insert_depart;




-- **************************************************************

PROCEDURE borrar_depart
	  (p_dep_borrar NUMBER,
	  p_dep_nue NUMBER)
 AS
 BEGIN 
	UPDATE emple SET dept_no = p_dep_nue
  	  WHERE DEPT_NO=p_dep_borrar;
	DELETE FROM depart WHERE dept_no  = p_dep_borrar;
        COMMIT;
   EXCEPTION
	WHEN NO_DATA_FOUND THEN
	  RAISE_APPLICATION_ERROR('-20021','Err Cod. Departamento no encontrado');
	    when others then
       RAISE_APPLICATION_ERROR('-20028','Err Cod. Departamento no encontrado');
END borrar_depart; 
-- **************************************************************
 PROCEDURE cambiar_localidad(
	p_num_dep NUMBER,
	p_loc VARCHAR2)
 AS
	e_dept_no_encontrado EXCEPTION;
 BEGIN
	UPDATE depart
		SET LOC=p_loc
		WHERE dept_no=p_num_dep;
	IF SQL%NOTFOUND
	THEN
		RAISE e_dept_no_encontrado;
        ELSE 
                COMMIT;
	END IF;
 EXCEPTION
	WHEN e_dept_no_encontrado THEN
		RAISE_APPLICATION_ERROR('-20011','Err Nombre Departamento no encontrado');
END cambiar_localidad;


-- ************************************************************

PROCEDURE visualizar_lista_depart
	   (c_depart OUT tcursor)
AS

BEGIN
	 OPEN c_depart FOR
		SELECT * FROM depart;
END visualizar_lista_depart;

-- *************************************************************
PROCEDURE visualizar_datos_depart
	  (p_num_dep IN OUT NUMBER,
	   p_nom_dep OUT VARCHAR2,
	   p_loc_dep OUT VARCHAR2,
	   p_num_empleados OUT NUMBER)
 AS

 BEGIN
	SELECT dept_no, dnombre, loc INTO p_num_dep,p_nom_dep,p_loc_dep 
		FROM depart
		WHERE DEPT_NO=p_num_dep;

	SELECT COUNT(*) INTO p_num_empleados
		FROM EMPLE
		WHERE DEPT_NO=p_num_dep;
 EXCEPTION
	WHEN NO_DATA_FOUND THEN
	  RAISE_APPLICATION_ERROR('-20021','Err Cod. Departamento no encontrado');
 END visualizar_datos_depart;
-- ************************************************************* 
--  Versión sobrecargada 
 PROCEDURE visualizar_datos_depart 
	  (p_nom_dep IN VARCHAR2,
	   c_depart OUT tcursor,
	   p_num_empleados OUT NUMBER)
 AS
	p_num_dep depart.dept_no%TYPE;
 BEGIN
	p_num_dep:=buscar_depart_por_nombre(p_nom_dep);
	OPEN c_depart FOR 
					SELECT *  
						FROM depart 
						WHERE dept_no=p_num_dep;
	SELECT COUNT(*) INTO p_num_empleados FROM EMPLE 
		WHERE dept_no=p_num_dep;

 EXCEPTION
	WHEN NO_DATA_FOUND THEN
	  RAISE_APPLICATION_ERROR('-20021','Err Cod. Departamento no encontrado');
 END visualizar_datos_depart; 


 FUNCTION  buscar_depart_por_nombre
	  (p_nom_dep VARCHAR2)
 RETURN NUMBER
 AS
	p_num_dep depart.dept_no%TYPE;
 BEGIN
	SELECT dept_no INTO p_num_dep FROM depart
WHERE DNOMBRE = p_nom_dep;
	RETURN p_num_dep;
 EXCEPTION
	WHEN NO_DATA_FOUND THEN
		RAISE_APPLICATION_ERROR('-20011','Err Nombre Departamento no encontrado');
 END buscar_depart_por_nombre;
 -- *************************************************************

END gest_depart;
