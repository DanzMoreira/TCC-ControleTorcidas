--------------------------------------------------------
--  Ref Constraints for Table CIDADE
--------------------------------------------------------

  ALTER TABLE "CIDADE" ADD CONSTRAINT "CIDADE_FK_ESTADO" FOREIGN KEY ("FK_ESTADO")
	  REFERENCES "ESTADO" ("ID_ESTADO") ENABLE;
  ALTER TABLE "CIDADE" ADD CONSTRAINT "CIDADE_FK_PAIS" FOREIGN KEY ("FK_PAIS")
	  REFERENCES "PAIS" ("ID_PAIS") ENABLE;
