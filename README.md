# java-springboot-cucumber
springboot app with cucumber to integrated tests


# Passos para testar  o primeiro cenario.

	    //0) apaga respostas dos operadores, perguntas e  listas do dia de hoje (MYSQL)		
		//1)insere operador de contagem (MYSQL)		
		//2)Insere operador de Ajuste (MYSQL)
		//3)Insere lista (post rest)
		//4)Fase 1: insere a pergunta (BatataFrita) pelo fluxo do Alerta de Estoque id 1111 na lista criada no passo anterior (post rest)		
		//5)recupera o id da pergunta  (mysql)		
		//)reponde a pergunta com o numero 30 (post Rest)
		//6)recupera o id da resposta (Mysql)
		
		//Assert: Criou alguma lista hoje para o operador ajuste? esperado =SIM
		//Assert: Adicionou a (Fase2) Pergunta (BatataFrita) nessa lista? resposta = SIM
		//Assert: gravou a resposta com o numero 30 para a Fase 1 = SIM