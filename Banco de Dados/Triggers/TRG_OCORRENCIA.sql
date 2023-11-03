--------------------------------------------------------
--  DDL for Trigger TRG_OCORRENCIA
--------------------------------------------------------

  CREATE OR REPLACE NONEDITIONABLE TRIGGER "OWNER_TCC"."TRG_OCORRENCIA" BEFORE
    INSERT ON owner_tcc.ocorrencia
    FOR EACH ROW
DECLARE
    v_seq NUMBER(4) := 0;
BEGIN
    BEGIN
        SELECT  nvl(max(o.id_ocorrencia),0)
        INTO v_seq
        FROM ocorrencia o
        WHERE o.id_num_cpf = :new.id_num_cpf;
            

    EXCEPTION
        WHEN no_data_found THEN
            v_seq := 0;
        WHEN others THEN
            v_seq := 0;    
    END;     
  --
    :new.id_ocorrencia := v_seq + 1;
  --
END;
/
ALTER TRIGGER "OWNER_TCC"."TRG_OCORRENCIA" ENABLE;
