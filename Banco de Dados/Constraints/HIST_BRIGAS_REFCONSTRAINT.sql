--------------------------------------------------------
--  Ref Constraints for Table HIST_BRIGAS
--------------------------------------------------------

  ALTER TABLE "HIST_BRIGAS" ADD CONSTRAINT "HIST_BRIGAS_FK_PESSOA" FOREIGN KEY ("FK_PESSOA")
	  REFERENCES "PESSOA" ("ID_NUM_CPF") ENABLE;
