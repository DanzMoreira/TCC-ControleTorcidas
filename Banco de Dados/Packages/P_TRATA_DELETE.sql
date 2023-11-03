--------------------------------------------------------
--  DDL for Package Body P_TRATA_DELETE
--------------------------------------------------------

  CREATE OR REPLACE PACKAGE BODY "OWNER_TCC"."P_TRATA_DELETE" is 

   procedure p_deleta_cpf (p_cpf     in number
                          ,p_retorno out int ) is 
   v_cpf number;
   v_oco number;
   
   
   begin
     begin 
       delete from ocorrencia o
        where o.id_ocorrencia  = p_cpf; 
     
       v_oco := 1;
      
     exception 
       when no_data_found then 
       v_oco :=1;
       when others then 
       v_oco :=0;
     end ;
   --
    begin 
       delete from pessoa o
        where o.id_num_cpf  = p_cpf; 
      
      v_cpf :=1;
      
    exception 
      when no_data_found then 
       v_cpf :=1;
      when others then 
       v_cpf :=0;
    end ;
   --
     if v_cpf =1 and v_oco =1 then 
       commit; 
       p_retorno := 1;
     else
       rollback;
       p_retorno := 0;
     end if; 
   --   
   end p_deleta_cpf; 
   --
   --
   --
   procedure p_deleta_ocorrencia (p_cpf        in number
                                 ,p_ocorrencia in number
                                 ,p_retorno    out int ) is 
   v_cpf number;
   v_oco number;
   
   
   begin
     begin 
       delete from ocorrencia o
        where o.id_num_cpf     = p_cpf
          and o.id_ocorrencia  = p_ocorrencia; 
     
       commit; 
       v_oco := 1;
       
     exception 
       when no_data_found then 
       v_oco :=1;
       when others then 
       v_oco :=0;
     end ;

   --
     if  v_oco = 1 then 
       commit;
       p_retorno := 1;--true
     else
       rollback; 
       p_retorno := 0;--false
     end if; 
   --   
   end p_deleta_ocorrencia; 

end p_trata_delete;

/
--------------------------------------------------------
--  DDL for Package P_TRATA_DELETE
--------------------------------------------------------

  CREATE OR REPLACE PACKAGE "OWNER_TCC"."P_TRATA_DELETE" is 



   procedure p_deleta_cpf (p_cpf     in number
                          ,p_retorno out int );
   --
   --
   --
   procedure p_deleta_ocorrencia (p_cpf        in number
                                 ,p_ocorrencia in number
                                 ,p_retorno    out int ); 
   

end p_trata_delete;

/
