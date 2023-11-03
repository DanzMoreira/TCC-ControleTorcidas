--------------------------------------------------------
--  Ref Constraints for Table ESTADO
--------------------------------------------------------

  ALTER TABLE "ESTADO" ADD CONSTRAINT "ESTADO_FK_PAIS" FOREIGN KEY ("FK_PAIS")
	  REFERENCES "PAIS" ("ID_PAIS") ENABLE;
