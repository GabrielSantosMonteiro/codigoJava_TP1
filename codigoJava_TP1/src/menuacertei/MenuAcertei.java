package menuacertei;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuAcertei {

    public static void main(String[] args) {
    	
        ArrayList<String> questoes = new ArrayList<String>();
        ArrayList<String> editais = new ArrayList<String>();
        ArrayList<String> ids_Edital = new ArrayList<String>();
        ArrayList<String> datasinicio = new ArrayList<String>();
        ArrayList<String> datasfinais = new ArrayList<String>();
        ArrayList<String> vagas = new ArrayList<String>();
        ArrayList<String> bancas = new ArrayList<String>();
        ArrayList<String> requisitos = new ArrayList<String>();
        ArrayList<String> materias = new ArrayList<String>();
        ArrayList<Integer> questoesPorMateria = new ArrayList<Integer>();
        
        try (Scanner scanner = new Scanner(System.in)) {
			int opcao = 0;

			do {
			    System.out.println("=========== MENU ===========");
			    System.out.println("1 - Cadastrar Questão");
			    System.out.println("2 - Excluir Questão");
			    System.out.println("3 - Consultar questões cadastradas");
			    System.out.println("4 - Listar por matéria");
			    System.out.println("5 - Cadastrar Edital");
			    System.out.println("6 - Excluir Edital");
			    System.out.println("7 - Exibir Editais Cadastrados");
			    System.out.println("8 - Encerrar");
			    System.out.println("============================");
			    System.out.println("Digite a opção desejada:  ");
			    opcao = scanner.nextInt();
			    scanner.nextLine();																									

			    switch (opcao) {
			        case 1:
			            System.out.println("Digite a questão a ser cadastrada:");
			            String questao = scanner.nextLine();

			            System.out.println("Digite a matéria da questão:");
			            String materia = scanner.nextLine();
			            int indexMateria = materias.indexOf(materia);
			            if(indexMateria == -1){
			                materias.add(materia);
			                questoesPorMateria.add(1);
			            } else {
			                questoesPorMateria.set(indexMateria, questoesPorMateria.get(indexMateria) + 1);
			            }
			            
			            questoes.add(questao);
			            System.out.println("Questão cadastrada com sucesso!");
			            break;
			            
			        case 2:{
			            System.out.println("As questões são feitas cadastradas em ordem, deseja ver as questões cadastradas em ordem?");
			            System.out.println("1- Sim 2 - Não");
			            int escolha = scanner.nextInt();
			            
			            if (escolha == 1) {
			            	System.out.println("As questões cadastradas são:");
				            System.out.println("================================");
				            for (int u = 0; u < questoes.size(); u++) {
			                    System.out.println(u + "-" + questoes.get(u));
			                }
				            System.out.println("================================");
				            
				            System.out.println("Digite o índice da questão que deseja excluir");
				            int indice = scanner.nextInt();
				            scanner.nextLine();
				            if (indice >= 0 && indice < questoes.size()) {
				                questoes.remove(indice);
				                System.out.println("Questão excluída com sucesso!");
				            break;}}
			            
			            if (escolha == 2) {
			    			System.out.println("Digite o índice da questão que deseja excluir");
				            int indice = scanner.nextInt();
				            scanner.nextLine();
				            if (indice >= 0 && indice < questoes.size()) {
				                questoes.remove(indice);
				                System.out.println("Questão excluída com sucesso!");
				            }} else {
				                System.out.println("Índice inválido!");
				            }}
				            break;
			            
			        case 3:{
			        	if (questoes.isEmpty()) {
			        		System.out.println("Não há questões cadastradas!");
			        		break;
			        	} else {
			        		System.out.println("As questões cadastradas são:");
				            System.out.println("================================");
				            for (String q : questoes) {
				                System.out.println(q);
				            }
				            System.out.println("================================");
				            break;
			        	}}
			            
			        case 4:
			        	if (materias.isEmpty()) {
			        	System.out.println("Não há matérias cadastradas!");
			        	break;
			        	}
			        	for (int i = 0; i < materias.size(); i++) {
			        	String materia2 = materias.get(i);
			        	
			        	System.out.printf("Matéria: " + materia2);
			        	for (int j = 0; j < questoes.size(); j++) {
			        	if (materia2.equals(materias.get(j))) {
			        		
			        	System.out.printf("\n Questão %d: %s\n", j, questoes.get(j));
			        	}
			        	}
			        	System.out.println("================================");
			        	}
			        	break;
			        	
			        case 5:
			        	
			        	System.out.println("Nome:");
			            String nomeEdital = scanner.nextLine();
			            editais.add(nomeEdital);
			            
			            System.out.println("ID do Edital:");
			            String ID_Edital = scanner.nextLine();
			            ids_Edital.add(ID_Edital);
			            
			            System.out.println("Data início:");
			            String dataInicio = scanner.nextLine();
			            datasinicio.add(dataInicio);
			            
			            System.out.println("Data final:");
			            String dataFinal = scanner.nextLine();
			            datasfinais.add(dataFinal);
			            
			            System.out.println("Número de vagas:");
			            String vaga = scanner.nextLine();
			            vagas.add(vaga);
			            
			            System.out.println("Banca:");
			            String banca = scanner.nextLine();
			            bancas.add(banca);
			            
			            System.out.println("Requisitos da vaga:");
			            String requisito = scanner.nextLine();
			            requisitos.add(requisito);
			            
			            System.out.println("\nEdital cadastrado com sucesso!");
			            
			            break;
				            
			        case 6: {
			            if (editais.isEmpty()) {
			                System.out.println("Não há editais cadastrados!");
			            } else {
			                System.out.println("Os editais cadastrados são:");
			                System.out.println("================================");
			                for (int i = 0; i < editais.size(); i++) {
			                    System.out.println(i + "-" + editais.get(i));
			                }
			                System.out.println("================================");
			                System.out.println("Digite o índice do edital que deseja excluir");
			                int indice = scanner.nextInt();
			                scanner.nextLine();
			                if (indice >= 0 && indice < editais.size()) {
			                    
			                	editais.remove(indice);
			                    
			                    ids_Edital.remove(indice);
			                    
			                    datasinicio.remove(indice);
			                    
			                    datasfinais.remove(indice);
			                    
			                    vagas.remove(indice);
			                    
			                    bancas.remove(indice);
			                    
			                    requisitos.remove(indice);
			                    
			                    System.out.println("Edital excluído com sucesso!");
			                } else {
			                    System.out.println("Índice inválido!");
			                }
			            }
			            break;
			        }

			        case 7:
			            if (editais.isEmpty()) {
			                System.out.println("Não há editais cadastrados!");
			            } else {
			                System.out.println("Os editais cadastrados são:");
			                System.out.println("================================");
			                for (int i = 0; i < editais.size(); i++) {
			                	
			                    
			                	System.out.println(ids_Edital.get(i) + "-" + editais.get(i));
			                    
			                	System.out.println("Data de início: " + datasinicio.get(i));
			                    
			                	System.out.println("Data de término: " + datasfinais.get(i));
			                    
			                	System.out.println("Número de vagas: " + vagas.get(i));
			                    
			                	System.out.println("Banca examinadora: " + bancas.get(i));
			                    
			                	System.out.println("Requisitos: " + requisitos.get(i));
			                    
			                	System.out.println("--------------------------------");
			                }
			                System.out.println("================================");
			            }
			            break;
			        	
			        case 8:
			            System.out.println("Encerrando sistema...");
			            System.out.println("Até a próxima!");
			            break;
			        default:
			            System.out.println("Opção inválida!");
			    }

			    System.out.println();

			} while (opcao != 8);
			scanner.close();
		}
    }
}
