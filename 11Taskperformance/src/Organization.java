import java.util.*;

public class Organization {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String help;
		System.out.println("---------------HEALTHCARECHATBOT-------------------");
		System.out.print("Type your name ");
		String name = sc.nextLine();
		System.out.println("\nHi "+name+" Thanks for using HEALTHCARECHATBOT!\n");
		do {
		
		
		System.out.println("Get started or Exit\n");
		System.out.print("-->");
		String start = sc.nextLine();
		
		if (start.equalsIgnoreCase("get started")) {
				System.out.println("\nHi "+ name + "! I'm relly sorry to hear that you or loved one is dealing with disease. \n"
						+ "We are here to give you  helpful tips about what todo if someone you loved just got diagnose or \n"
						+ "you've been dealing with for a while. Be strong! Stay positive \n");
				System.out.println("Type --let's go-- or ---exit---");
				System.out.print("-->");
				String go = sc.nextLine();
				
				if(go.equalsIgnoreCase("let's go")) {
					System.out.println("Choose one option or type your Question");
					System.out.println("-About Stroke\n-About Malaria \n-About HIV/AIDS");
					System.out.print("\n-->");
					String choose =sc.nextLine();
					
					if(choose.equalsIgnoreCase("About Stroke")) {
						System.out.println("The three main types of stroke are: Ischemic Stroke  Hemorrhagic Stroke  Transient Ischemic Attack (TIA)");
						System.out.println("Most strokes (87%) are ischemic strokes. An ischemic stroke happens when blood flow through \n"
								+ "the artery that supplies oxygen-rich blood to the brain becomes blocked. Blood clots often cause the \n"
								+ "blockages that lead to ischemic strokes. A hemorrhagic stroke happens when an artery in the brain leaks\n"
								+ " blood or ruptures (breaks open). The leaked blood puts too much pressure on brain cells, which damages them.\n"
								+ "A transient ischemic attack (TIA) is sometimes called a “mini-stroke.” It is different from the major types of \n"
								+ "stroke because blood flow to the brain is blocked for only a short time—usually no more than 5 minutes.");
						System.out.println("Select one option");
						System.out.println("-What should stroke patients avoid? \n-Can drinking water help prevent a stroke?\n");
						System.out.print("-->");
						String select =sc.nextLine();
						
						if(select.equalsIgnoreCase("What should stroke patients avoid?")) {
							System.out.println("Limit foods high in saturated fat such as biscuits, cakes, pastries, pies, processed meats, commercial burgers,\n"
									+ " pizza, fried foods, potato chips, crisps and other savoury snacks. Limit foods which contain mostly saturated fats such\n"
									+ " as butter, cream, cooking margarine, coconut oil and palm oil.");
						}
						else if(select.equalsIgnoreCase("Can drinking water help prevent a stroke??")){
							 System.out.println("Drinking more water may help prevent a stroke. Many studies have proven that proper hydration at the time of a \n"
							 		+ "stroke is linked to better stroke recovery. It is possible that dehydration causes blood to be thicker. Viscous blood causes\n"
							 		+ " the body to retain sodium and increases blood pressur");
							 
							
						}
						
						
						
					}
					else if(choose.equalsIgnoreCase("About Malaria")) {
						System.out.println("Malaria is caused in humans by five species of single-cell, eukaryotic Plasmodium parasites (mainly Plasmodium falciparum and Plasmodium vivax)\n "
								+ "that are transmitted by the bite of Anopheles mosquitoes. In humans, malaria parasites grow and multiply first in the liver cells and then exponentially\n "
								+ " in the red blood cells. It is the blood stage of the parasite lifecycle that causes the symptoms of malaria in humans Malaria is usually classified as\n"
								+ " asymptomatic, uncomplicated or severe.\n");
						System.out.println("Select one option");
						System.out.println("-What are the symptoms of malaria?\n -How is malaria treated?");
						System.out.print("-->");
						String select =sc.nextLine();
						if(select.equalsIgnoreCase("What are the symptoms of malaria?")) {
							System.out.println("Malaria symptoms usually appear 10 days to one month after the person was infected. Symptoms can be mild. Some people don’t feel sick for up\n"
							 		+ " to a year after the mosquito bite. Parasites can live in the body for several years without causing symptoms.\n");
						}
						else if(select.equalsIgnoreCase("How is malaria treated?")){
							 
							 System.out.println("Treatment for malaria should start as soon as possible. To treat malaria, your provider will prescribe drugs to kill the malaria parasite.\n"
							 		+ " Some parasites are resistant to malaria drugs. The type of medication and length of treatment depend on which parasite is causing your symptoms.");
							
						}
						
					}
					
					else if(choose.equalsIgnoreCase("About HIV/AIDS")) {
						System.out.println("HIV (human immunodeficiency virus) is a virus that attacks the body’s immune system. If HIV is not treated, it can lead to AIDS \n"
								+ "(acquired immunodeficiency syndrome). There is currently no effective cure. Once people get HIV, they have it for life. Acquired Immunodeficiency Syndrome (AIDS)\n"
								+ "The most severe phase of HIV infection. People with AIDS have such badly damaged immune systems that they get an increasing number of severe illnesses, called \n"
								+ "opportunistic infections.");
					}
					
					
					
				}
				
				}
         else if(start.equalsIgnoreCase("exit")) {
        	 
			
		}
				
		
		
		else {
			System.out.println("Your input is not valid");
		}
			System.out.println("thanks for your time!");
			System.out.println("Need help again? ");
			 help = sc.next();
			
	}
			
		while(help.equalsIgnoreCase("yes"));
		
		

	}

}
