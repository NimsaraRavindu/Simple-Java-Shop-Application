import java.util.*;
class FashionShop{
	public static String[] orderIdArray=new String[0];
	public static String[] customerPhoneArray=new String[0];
	public static String[] sizeArray=new String[0];
	public static int[] qtyArray=new int [0];
	public static double[] amountArray=new double[0];
	public static int[] statusArray=new int[0];
	public static int orderId = 1;
	public static final int PROCESSING=0;
	public static final int DELIVERING=1;
	public static final int DELIVERED=2;
	public static String[] customerPhoneArray1=new String[0];
	public static int[] qtyArray1=new int [0];
	public static double[] amountArray1=new double[0];
	public static String[] customerPhoneArrayDone=new String[0];
	
	public static void deleteCustomer(int index){
		 String[] temporderIdArray=new String[orderIdArray.length-1];
		 String[] tempcustomerPhoneArray=new String[customerPhoneArray.length-1];
		 String[] tempsizeArray=new String[sizeArray.length-1];
		 int[] tempqtyArray=new int[qtyArray.length-1];
		 double[] tempamountArray=new double[amountArray.length-1];
		 int[] tempstatusArray=new int[statusArray.length-1];
		 
		 for(int i=index;i<orderIdArray.length-1;i++){
			temporderIdArray[i]=orderIdArray[i]; 
			tempcustomerPhoneArray[i]=customerPhoneArray[i];
			tempsizeArray[i]=sizeArray[i];
			tempqtyArray[i]=qtyArray[i];
			tempamountArray[i]=amountArray[i];
			tempstatusArray[i]=statusArray[i]; 
		 }
		 for(int i=0;i<index;i++){
			temporderIdArray[i]=orderIdArray[i]; 
			tempcustomerPhoneArray[i]=customerPhoneArray[i];
			tempsizeArray[i]=sizeArray[i];
			tempqtyArray[i]=qtyArray[i];
			tempamountArray[i]=amountArray[i];
			tempstatusArray[i]=statusArray[i];  
		 }
		orderIdArray=temporderIdArray;
		customerPhoneArray=tempcustomerPhoneArray;
		sizeArray=tempsizeArray;
		qtyArray=tempqtyArray;
		amountArray=tempamountArray;
		statusArray=tempstatusArray;
	}
	public static void extendArray(){
		 String[] temporderIdArray=new String[orderIdArray.length+1];
		 String[] tempcustomerPhoneArray=new String[customerPhoneArray.length+1];
		 String[] tempsizeArray=new String[sizeArray.length+1];
		 int[] tempqtyArray=new int[qtyArray.length+1];
		 double[] tempamountArray=new double[amountArray.length+1];
		 int[] tempstatusArray=new int[statusArray.length+1];
		 
		for(int i=0;i<orderIdArray.length;i++){
			temporderIdArray[i]=orderIdArray[i];
			tempcustomerPhoneArray[i]=customerPhoneArray[i];
			tempsizeArray[i]=sizeArray[i];
			tempqtyArray[i]=qtyArray[i];
			tempamountArray[i]=amountArray[i];
			tempstatusArray[i]=statusArray[i];
		}
		orderIdArray=temporderIdArray;
		customerPhoneArray=tempcustomerPhoneArray;
		sizeArray=tempsizeArray;
		qtyArray=tempqtyArray;
		amountArray=tempamountArray;
		statusArray=tempstatusArray;
	}
	public final static void clearConsole() { 
		try {
		final String os = System.getProperty("os.name"); 
		if (os.contains("Windows")) {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} else {
		System.out.print("\033[H\033[2J"); 
		System.out.flush();
		}
		} catch (final Exception e) {
		e.printStackTrace();
		// Handle any exceptions.
		}
		}
		
		public static void sort(int[] ar){
		for(int i=0; i<ar.length-1; i++){
			for(int j=0; j<ar.length -i -1; j++){
				if(ar[j]<ar[j+1]){
					int t=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=t;
					
					String z=customerPhoneArray1[j];
					customerPhoneArray1[j]=customerPhoneArray1[j+1];
					customerPhoneArray1[j+1]=z;
					
					double y=amountArray1[j];
					amountArray1[j]=amountArray1[j+1];
					amountArray1[j+1]=y;
				}
			}
		}
		for(int i=0;i<customerPhoneArray1.length;i++){
		System.out.println("|                 |             |                     |"); 
		System.out.println("|  "+customerPhoneArray1[i]+"     |    "+qtyArray1[i]+"        |   "+amountArray1[i]+"            |");
	}
	System.out.println("+-----------------+-------------+---------------------+");
	}
	
	public static void extendArray1(){
		 String[] tempcustomerPhoneArray=new String[customerPhoneArray1.length+1];
		 int[] tempqtyArray=new int[qtyArray1.length+1];
		 double[] tempamountArray=new double[amountArray1.length+1];
		  
		for(int i=0;i<customerPhoneArray1.length;i++){
			tempcustomerPhoneArray[i]=customerPhoneArray1[i];
			tempqtyArray[i]=qtyArray1[i];
			tempamountArray[i]=amountArray1[i];	
		}
		tempqtyArray[tempqtyArray.length - 1] = 0; 
        tempamountArray[tempamountArray.length - 1] = 0.0;
		customerPhoneArray1=tempcustomerPhoneArray;
		qtyArray1=tempqtyArray;
		amountArray1=tempamountArray;
	}
	public static void extendArray2(){
	String[] tempcustomerPhoneArrayDone=new String[customerPhoneArrayDone.length+1];
	for(int i=0;i<customerPhoneArrayDone.length;i++){
		tempcustomerPhoneArrayDone[i]=customerPhoneArrayDone[i];
}
	customerPhoneArrayDone=tempcustomerPhoneArrayDone;
}

public static void deletenull(){
	int nonNullCount = 0;
        for (String phone : customerPhoneArray1) {
            if (phone != null) {
                nonNullCount++;
            }
        }
        String[] newCustomerPhoneArray1 = new String[nonNullCount];
        int[] newQtyArray1 = new int[nonNullCount];
        double[] newAmountArray1 = new double[nonNullCount];

        int index = 0;
        for (int i = 0; i < customerPhoneArray1.length; i++) {
            if (customerPhoneArray1[i] != null) {
                newCustomerPhoneArray1[index] = customerPhoneArray1[i];
                newQtyArray1[index] = qtyArray1[i];
                newAmountArray1[index] = amountArray1[i];
                index++;
            }
        }
        customerPhoneArray1 = newCustomerPhoneArray1;
        qtyArray1 = newQtyArray1;
        amountArray1 = newAmountArray1;
    }

	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		boolean homepage=true;
		while(homepage){
        clearConsole();
        System.out.println("/$$$$$$$$                 /$$       /$$                            /$$$$$$  /$$                          ");
        System.out.println("| $$_____/                | $$      |__/                           /$$__  $$| $$                          ");
        System.out.println("| $$    /$$$$$$   /$$$$$$$| $$$$$$$  /$$  /$$$$$$  /$$$$$$$       | $$  \\__/| $$$$$$$   /$$$$$$   /$$$$$$ ");
        System.out.println("| $$$$$|____  $$ /$$_____/| $$__  $$| $$ /$$__  $$| $$__  $$      |  $$$$$$ | $$__  $$ /$$__  $$ /$$__  $$");
        System.out.println("| $$__/ /$$$$$$$|  $$$$$$ | $$  \\ $$| $$| $$  \\ $$| $$  \\ $$       \\____  $$| $$  \\ $$| $$  \\ $$| $$  \\ $$");
        System.out.println("| $$   /$$__  $$ \\____  $$| $$  | $$| $$| $$  | $$| $$  | $$       /$$  \\ $$| $$  | $$| $$  | $$| $$  | $$");
        System.out.println("| $$  |  $$$$$$$ /$$$$$$$/| $$  | $$| $$|  $$$$$$/| $$  | $$      |  $$$$$$/| $$  | $$|  $$$$$$/| $$$$$$$/");
        System.out.println("|__/   \\_______/|_______/ |__/  |__/|__/ \\______/ |__/  |__/       \\______/ |__/  |__/ \\______/ | $$____/ ");
        System.out.println("                                                                                                | $$      ");
        System.out.println("                                                                                                | $$      ");
        System.out.println("                                                                                                |__/      ");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        
        System.out.print("\t\t[1]Place Order");
        System.out.println("\t\t\t\t\t[2]Search Customer\n");
        System.out.print("\t\t[3]Search Order");
        System.out.println("\t\t\t\t\t[4]View Reports\n");
        System.out.print("\t\t[5]Set Order Status");
        System.out.println("\t\t\t\t[6]Delete Order\n\n\n");
        System.out.print("Input option : ");
        int option=input.nextInt();
		boolean continueloop=true;
		boolean isyes=true;
		boolean placing=true;
		switch(option){
			case 1:
			while(isyes){
			clearConsole();
			System.out.println("  _____  _                   ____          _           ");
			System.out.println(" |  __ \\| |                 / __ \\        | |          ");
			System.out.println(" | |__) | | __ _  ___ ___  | |  | |_ __ __| | ___ _ __ ");
			System.out.println(" |  ___/| |/ _` |/ __/ _ \\ | |  | | '__/ _` |/ _ \\ '__|");
			System.out.println(" | |    | | (_| | (_|  __/ | |__| | | | (_| |  __/ |   ");
			System.out.println(" |_|    |_|\\__,_|\\___\\___|  \\____/|_|  \\__,_|\\___|_|   ");
			System.out.println("----------------------------------------------------------");
			String orderIdStr="ODR#" + String.format("%05d", orderId);
			System.out.println("Order ID : "+orderIdStr+"\n");
			orderId++;
			System.out.print("Enter Custmoer Phone Number:");
			String phonenum=input.next();
			System.out.println("\n");
			boolean valid=false;
			while(valid==false){
			if(phonenum.length()==10 && phonenum.startsWith("0")){
				System.out.print("Enter T-Shirt Size (XS/S/M/L/XL/XXL):");
				String size=input.next().toUpperCase();	
				System.out.println("\n");
				System.out.print("Enter QTY :");
				int qty=input.nextInt();
				System.out.println("\n");
				double totalPrice = 0.0;
				if(qty>0){
					 double priceXS = 600.00;
					 double priceS = 800.00;
					 double priceM = 900.00;
					 double priceL = 1000.00;
					 double priceXL = 1100.00;
					 double priceXXL = 1200.00;
					 if (size.equals("XS")) {
						totalPrice = priceXS * qty;
					} else if (size.equals("S")) {
						totalPrice = priceS * qty;
					} else if (size.equals("M")) {
						totalPrice = priceM * qty;
					} else if (size.equals("L")) {
						totalPrice = priceL * qty;
					} else if (size.equals("XL")) {
						totalPrice = priceXL * qty;
					} else if (size.equals("XXL")) {
						totalPrice = priceXXL * qty;
					} else {
						System.out.println("\n\n\n\t\tInvalid size entered..");
						orderId--;
						break;
				}
				System.out.println("Amount :"+totalPrice);
				valid=true;
				System.out.print("\n\n\nDo you want to place this order? (Y/N): ");
	             String invalidinput=input.next().toUpperCase();
                 if(invalidinput.equals("Y")){
					isyes=true;
					extendArray();
					orderIdArray[orderIdArray.length-1]=orderIdStr;
					customerPhoneArray[customerPhoneArray.length-1]=phonenum;
					sizeArray[sizeArray.length-1]=size;
					qtyArray[qtyArray.length-1]=qty;
					amountArray[amountArray.length-1]=totalPrice;
					statusArray[statusArray.length-1]=PROCESSING;
				}else{
					isyes=false;
					orderId--;
					break;
					} 
			}
				else{
				System.out.print("\n\n\nInvalid quantity.. Try Again ");
				valid=true;
				orderId--;
				break;		
				}		
			}else{
		    System.out.print("\n\n\nInvalid Phone Number.. Try Again ");
		    orderId--;
		    break;
		}
		
	}		
			System.out.print("\n\n\nDo you want to place another order? (Y/N): ");
	             String invalidinput=input.next().toUpperCase();
                 if(invalidinput.equals("Y")){
					isyes=true;
				}else{
					isyes=false;
					break;
					} 
					if(orderId==0){
					orderId++;
		}     	
		}
		break;
		case 2:
		while(isyes){
		clearConsole();	
		System.out.println("   _____                     _        _____          _                            ");
        System.out.println("  / ____|                   | |      / ____|        | |                           ");
        System.out.println(" | (___   ___  __ _ _ __ ___| |__   | |    _   _ ___| |_ ___  _ __ ___   ___ _ __ ");
        System.out.println("  \\___ \\ / _ \\/ _` | '__/ __| '_ \\  | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__|");
        System.out.println("  ____) |  __/ (_| | | | (__| | | | | |___| |_| \\__ \\ || (_) | | | | | |  __/ |   ");
        System.out.println(" |_____/ \\___|\\__,_|_|  \\___|_| |_|  \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|   ");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.print("Enter Cutomer Phone Number:");	
        String phone=input.next();
        boolean isvalid=false;
        double qty1=0,qty2=0,qty3=0,qty4=0,qty5=0,qty6=0,amount1=0,amount2=0,amount3=0,amount4=0,amount5=0,amount6=0;
        for(int i=0;i<customerPhoneArray.length;i++){
			if(phone.equals(customerPhoneArray[i])){
				isvalid=true;
				if(sizeArray[i].equals("M")){
					qty1+=qtyArray[i];
					amount1+=amountArray[i];
				}
			    else  if(sizeArray[i].equals("XL")){
					qty2+=qtyArray[i];
					amount2+=amountArray[i];
				}
				else if(sizeArray[i].equals("XXL")){
					qty3+=qtyArray[i];
					amount3+=amountArray[i];
				}
				else if(sizeArray[i].equals("XS")){
					qty4+=qtyArray[i];
					amount4+=amountArray[i];
				}
				else if(sizeArray[i].equals("S")){
					qty5+=qtyArray[i];
					amount5+=amountArray[i];
				}
				else if(sizeArray[i].equals("L")){
					qty6+=qtyArray[i];
					amount6+=amountArray[i];
				}
				
			}
		}
			if(isvalid==true){
			    System.out.println("+--------------+-----------+--------------+ ");
				System.out.println("|     Size     |   QTY     |    Amount    |");
				System.out.println("+--------------+-----------+--------------+");	
				System.out.println("|              |           |              |");
				System.out.println("|     M        |  "+qty1+"      |  "+amount1+"         |");
				System.out.println("|              |           |              |");
				System.out.println("|     XL       |  "+qty2+"      |  "+amount2+"         |");
				System.out.println("|              |           |              |");
				System.out.println("|     XXL      |  "+qty3+"      |  "+amount3+"         |");
				System.out.println("|              |           |              |");
				System.out.println("|     XS       |  "+qty4+"      |  "+amount4+"      |");
				System.out.println("|              |           |              |");
				System.out.println("|     S        |  "+qty5+"      |  "+amount5+"    |");
				System.out.println("|              |           |              |");
				System.out.println("|     L        |  "+qty6+"      |  "+amount6+"         |");
				System.out.println("|              |           |              |");
				System.out.println("+--------------+-----------+--------------+");
				System.out.println("|    Total Amount          |    "+(amount1+amount2+amount3+amount4+amount5+amount6)+"    |");
			}
		if(isvalid==false){
			System.out.print("\n\n\nInvalid Input.. ");
			
		}	
		System.out.print("\n\n\nDo you want to Search another Customer report? (Y/N): ");
	             String invalidinput=input.next().toUpperCase();
                 if(invalidinput.equals("Y")){
					isyes=true;
				}else{
					isyes=false;
					break;
					}  
	}
	break;
		case 3:
		   while(isyes){
			 clearConsole();  
			 System.out.println("   _____                     _        ____          _           ");
			 System.out.println("  / ____|                   | |      / __ \\        | |          ");
			 System.out.println(" | (___   ___  __ _ _ __ ___| |__   | |  | |_ __ __| | ___ _ __ ");
			 System.out.println("  \\___ \\ / _ \\/ _` | '__/ __| '_ \\  | |  | | '__/ _` |/ _ \\ '__|");
			 System.out.println("  ____) |  __/ (_| | | | (__| | | | | |__| | | | (_| |  __/ |   ");
			 System.out.println(" |_____/ \\___|\\__,_|_|  \\___|_| |_|  \\____/|_|  \\__,_|\\___|_|   ");  
			 System.out.println("---------------------------------------------------------------------\n\n");
			 System.out.print("Enter Order ID : ");	
			 String id=input.next(); 
			 boolean isvalidorder=false;
			 for(int i=0;i<orderIdArray.length;i++){
			 if(id.equals(orderIdArray[i])){
				System.out.println("\n\nPhone Number   : "+customerPhoneArray[i]); 
				System.out.println("Size           : "+sizeArray[i]);
				System.out.println("QTY            : "+qtyArray[i]);
				System.out.println("Amount         : "+amountArray[i]);
				if(statusArray[i]==0){
				System.out.println("Status         : "+"PROCESSING");
			}else if(statusArray[i]==1){
				System.out.println("Status         : "+"DELIVERING");	
			}else if(statusArray[i]==2){
				System.out.println("Status         : "+"DELIVERED");	
			}
				isvalidorder=true;
				break;		 
			 } 
		 } 
		  if(isvalidorder==false) {
				System.out.println("\n\n\n\t\tInvalid ID..  "); 
			}
			System.out.print("\n\n\nDo you want to Search another Order? (Y/N): ");
	             String invalidinput=input.next().toUpperCase();
                 if(invalidinput.equals("Y")){
					isyes=true;
				}else{
					isyes=false;
					break;
					} 
		   }
		   break;
		 case 4:
		 clearConsole();	
			System.out.println("  _____                       _       ");
			System.out.println(" |  __ \\                     | |      ");
			System.out.println(" | |__) |___ _ __   ___  _ __| |_ ___ ");
			System.out.println(" |  _  // _ \\ '_ \\ / _ \\| '__| __/ __|");
			System.out.println(" | | \\ \\  __/ |_) | (_) | |  | |_\\__ \\");
			System.out.println(" |_|  \\_\\___| .__/ \\___/|_|   \\__|___/");
			System.out.println("            | |                       ");
			System.out.println("            |_|                       ");
			System.out.println("-------------------------------------------n\n");
			System.out.println("\t\t[1]Customer Reports \n");
            System.out.println("\t\t[2]Item Reports \n");
            System.out.println("\t\t[3]Order Reports \n");
            System.out.print("Enter option : ");
			int option2=input.nextInt();	
			switch(option2){
				case 1:	
				clearConsole();	
				  System.out.println("   _____          _                              _____                       _       ");
				  System.out.println("  / ____|        | |                            |  __ \\                     | |      ");
                  System.out.println(" | |    _   _ ___| |_ ___  _ __ ___   ___ _ __  | |__) |___ _ __   ___  _ __| |_ ___ ");
                  System.out.println(" | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__| |  _  // _ \\ '_ \\ / _ \\| '__| __/ __|");
                  System.out.println(" | |___| |_| \\__ \\ || (_) | | | | | |  __/ |    | | \\ \\  __/ |_) | (_) | |  | |_\\__ \\");
                  System.out.println("  \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|    |_|  \\_\\___| .__/ \\___/|_|   \\__|___/");
                  System.out.println("                                                           | |                       ");
                  System.out.println("                                                           |_|                       ");
                  System.out.println("-------------------------------------------------------------------------------------------------n\n");
                  System.out.println("\t\t[1]Best in Customers \n");
				  System.out.println("\t\t[2]View Customers \n");
				  System.out.println("\t\t[3]All Customer Report \n");
				  System.out.print("Enter option : ");
					int option3=input.nextInt();	
					switch(option3){
	             	case 1:
	             	clearConsole();
	             	System.out.println("  ____            _     _____          _____          _                                ");
					System.out.println(" |  _ \\          | |   |_   _|        / ____|        | |                               ");
					System.out.println(" | |_) | ___  ___| |_    | |  _ __   | |    _   _ ___| |_ ___  _ __ ___   ___ _ __ ___ ");
					System.out.println(" |  _ < / _ \\/ __| __|   | | | '_ \\  | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__/ __|");
					System.out.println(" | |_) |  __/\\__ \\ |_   _| |_| | | | | |___| |_| \\__ \\ || (_) | | | | | |  __/ |  \\__ \\");
					System.out.println(" |____/ \\___||___/\\__| |_____|_| |_|  \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|  |___/ ");
					System.out.println("-------------------------------------------------------------------------------------------------\n\n");
					System.out.println("+-----------------+-------------+---------------------+ ");
					System.out.println("|   Customer ID   | All   QTY   |   Total   Amount    |");
					System.out.println("+-----------------+-------------+---------------------+");
					int index = 0;
					int index1 = 0;
					L1: for (int i = 0; i < customerPhoneArray.length; i++) {
						if (customerPhoneArray[i] == null) continue; 
							boolean isDuplicate = false;
							for (int a = 0; a < customerPhoneArrayDone.length; a++) {
								if (customerPhoneArrayDone[a] != null && customerPhoneArrayDone[a].equals(customerPhoneArray[i])) {
									isDuplicate = true; 
									break; 
								}
							}
							if (isDuplicate) continue L1; 
							extendArray2();
							customerPhoneArrayDone[index] = customerPhoneArray[i];
							index++;
						for (int r = 0; r < customerPhoneArray.length; r++) {
							if (customerPhoneArray[i].equals(customerPhoneArray[r])) {
								extendArray1();
								customerPhoneArray1[index1] = customerPhoneArray[i];
								qtyArray1[index1] += qtyArray[r];
								amountArray1[index1] += amountArray[r];
							}
						}
						index1++;
				}  
				    deletenull();
                    sort(qtyArray1);
					System.out.println("\t\tTo acess the  Main Menu, please enter 0 :");
					int zero=input.nextInt();
					break;
					
					case 2:
					clearConsole();
					System.out.println(" __      ___                  _____          _                                ");
					System.out.println(" \\ \\    / (_)                / ____|        | |                               ");
					System.out.println("  \\ \\  / / _  _____      __ | |    _   _ ___| |_ ___  _ __ ___   ___ _ __ ___ ");
					System.out.println("   \\ \\/ / | |/ _ \\ \\ /\\ / / | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__/ __|");
					System.out.println("    \\  /  | |  __/\\ V  V /  | |___| |_| \\__ \\ || (_) | | | | | |  __/ |  \\__ \\");
					System.out.println("     \\/   |_|\\___| \\_/\\_/    \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|  |___/ ");
					System.out.println("----------------------------------------------------------------------------------------\n\n");
					System.out.println("+-----------------+-------------+---------------------+ ");
					System.out.println("|   Customer ID   | All   QTY   |   Total   Amount    |");
					System.out.println("+-----------------+-------------+---------------------+");
					int index2 = 0;
					int index3 = 0;
					L1: for (int i = 0; i < customerPhoneArray.length; i++) {
						if (customerPhoneArray[i] == null) continue; 
							boolean isDuplicate = false;
							for (int a = 0; a < customerPhoneArrayDone.length; a++) {
								if (customerPhoneArrayDone[a] != null && customerPhoneArrayDone[a].equals(customerPhoneArray[i])) {
									isDuplicate = true; 
									break; 
								}
							}
							if (isDuplicate) continue L1; 
							extendArray2();
							customerPhoneArrayDone[index2] = customerPhoneArray[i];
							index2++;
						for (int r = 0; r < customerPhoneArray.length; r++) {
							if (customerPhoneArray[i].equals(customerPhoneArray[r])) {
								extendArray1();
								customerPhoneArray1[index3] = customerPhoneArray[i];
								qtyArray1[index3] += qtyArray[r];
								amountArray1[index3] += amountArray[r];
							}
						}
						index3++;
				}  
				    deletenull();
					for(int i=0;i<customerPhoneArray1.length;i++){
					System.out.println("|                 |             |                     |"); 
					System.out.println("|  "+customerPhoneArray1[i]+"     |    "+qtyArray1[i]+"        |   "+amountArray1[i]+"            |");
	}
				System.out.println("+-----------------+-------------+---------------------+");
					System.out.println("\t\tTo acess the  Main Menu, please enter 0 :");
					int zero1=input.nextInt();
					break;
					
					case 3:
					clearConsole();
					System.out.println("           _ _    _____          _                              _____                       _   ");
					System.out.println("     /\\   | | |  / ____|        | |                            |  __ \\                     | |  ");
					System.out.println("    /  \\  | | | | |    _   _ ___| |_ ___  _ __ ___   ___ _ __  | |__) |___ _ __   ___  _ __| |_ ");
					System.out.println("   / /\\ \\ | | | | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__| |  _  // _ \\ '_ \\ / _ \\| '__| __|");
					System.out.println("  / ____ \\| | | | |___| |_| \\__ \\ || (_) | | | | | |  __/ |    | | \\ \\  __/ |_) | (_) | |  | |_ ");
					System.out.println(" /_/    \\_\\_|_|  \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|    |_|  \\_\\___| .__/ \\___/|_|   \\__|");
					System.out.println("                                                                          | |                   ");
					System.out.println("                                                                          |_|                   ");
					System.out.println("------------------------------------------------------------------------------------------------------------\n\n");
					int ind1=0;
					System.out.println("+-----------------+-------------+---------------------+-----------+ ");
					System.out.println("|  Phone Number   |  XS  |  S  |  M  |  L  | XL | XXL |   Total   |");
					System.out.println("+-----------------+------+-----+-----+-----+----+-----+-----------+");
		    int qty1 = 0, qty2 = 0, qty3 = 0, qty4 = 0, qty5 = 0, qty6 = 0;
			double amount1 = 0;
			customerPhoneArrayDone=new String[0];
			int index4 = 0;
			L1: for (int i = 0; i < customerPhoneArray.length; i++) {
				if (customerPhoneArray[i] == null) continue; 
				boolean isDuplicate = false;
				for (int a = 0; a < customerPhoneArrayDone.length; a++) {
					if(customerPhoneArrayDone[a] != null && customerPhoneArrayDone[a].equals(customerPhoneArray[i])) {
						isDuplicate = true; 
						break; 
					}
				}
			if (isDuplicate) continue L1; 
			extendArray2();
			customerPhoneArrayDone[index4] = customerPhoneArray[i];
			index4++;
			qty1 = qty2 = qty3 = qty4 = qty5 = qty6 = 0;
			amount1 = 0;
    for (int r = 0; r < customerPhoneArray.length; r++) {
        if (customerPhoneArray[i].equals(customerPhoneArray[r])) {
            switch(sizeArray[r]) {
                case "M":
                    qty1 += qtyArray[r];
                    break;
                case "XL":
                    qty2 += qtyArray[r];
                   break;
                case "XXL":
                    qty3 += qtyArray[r];
                   break;
                case "XS":
                    qty4 += qtyArray[r];
                   break;
                case "S":
                    qty5 += qtyArray[r];
                    break;
                case "L":
                    qty6 += qtyArray[r];
                    break;
            }
            amount1 += amountArray[r];
        }
    }
		System.out.println("|                 |      |     |     |     |    |     |           |");
		System.out.println("| "+customerPhoneArray[i]+"      | "+qty4+"    |   "+qty5+" |  "+qty1+"  |  "+qty6+"  |  "+qty2+" |  "+qty3+"  |   "+amount1+"  |");
	}
		System.out.println("+-----------------+------+-----+-----+-----+----+-----+-----------+");				
		System.out.println("\t\tTo acess the  Main Menu, please enter 0 :");
		zero=input.nextInt();
		break;			
						
			}
			break;
			
				case 2:	
				clearConsole();
				System.out.println("  _____ _                   _____                       _       ");
				System.out.println(" |_   _| |                 |  __ \\                     | |      ");
				System.out.println("   | | | |_ ___ _ __ ___   | |__) |___ _ __   ___  _ __| |_ ___ ");	
				System.out.println("   | | | __/ _ \\ '_ ` _ \\  |  _  // _ \\ '_ \\ / _ \\| '__| __/ __|");
				System.out.println("  _| |_| ||  __/ | | | | | | | \\ \\  __/ |_) | (_) | |  | |_\\__ \\");
				System.out.println(" |_____|\\__\\___|_| |_| |_| |_|  \\_\\___| .__/ \\___/|_|   \\__|___/");
				System.out.println("                                      | |                       ");
				System.out.println("                                      |_|                       ");
				System.out.println("--------------------------------------------------------------------\n\n");
				System.out.println("\t\t[1]Best Selling Categories Sorted by QTY \n");
				System.out.println("\t\t[2]Best Selling Categories Sorted by Amount \n");
				System.out.print("Enter option : ");
				int opt1=input.nextInt();	
				switch(opt1){
					case 1:	
					clearConsole();
				    System.out.println("   _____            _           _   ____           ____ _________     __");
					System.out.println("  / ____|          | |         | | |  _ \\         / __ \\__   __\\ \\   / /");
					System.out.println(" | (___   ___  _ __| |_ ___  __| | | |_) |_   _  | |  | | | |   \\ \\_/ / ");
					System.out.println("  \\___ \\ / _ \\| '__| __/ _ \\/ _` | |  _ <| | | | | |  | | | |    \\   /  ");
					System.out.println("  ____) | (_) | |  | ||  __/ (_| | | |_) | |_| | | |__| | | |     | |   ");
					System.out.println(" |_____/ \\___/|_|   \\__\\___|\\__,_| |____/ \\__, |  \\___\\_\\ |_|     |_|   ");
					System.out.println("                                           __/ |                        ");
					System.out.println("                                          |___/                         ");
					System.out.println("---------------------------------------------------------------------------\n\n");
		            String[] sizes = {"M", "XL", "XXL", "XS", "S", "L"};
					int[] quantities = new int[sizes.length];
					double[] amounts = new double[sizes.length];
					for (int i = 0; i < sizeArray.length; i++) {
						for (int j = 0; j < sizes.length; j++) {
							if (sizeArray[i].equals(sizes[j])) {
							 quantities[j] += qtyArray[i];
							 amounts[j] += amountArray[i];
							}
						}
					}
					for (int i = 0; i < quantities.length - 1; i++) {
						for (int j = 0; j < quantities.length - 1 - i; j++) {
							if (quantities[j] < quantities[j + 1]) {
								int tempQty = quantities[j];
								quantities[j] = quantities[j + 1];
								quantities[j + 1] = tempQty;
								String tempSize = sizes[j];
								sizes[j] = sizes[j + 1];
								sizes[j + 1] = tempSize;
								double tempAmount = amounts[j];
								amounts[j] = amounts[j + 1];
								amounts[j + 1] = tempAmount;
							}
					}
				}
		System.out.println("+-----------------+------+-----------+");
		System.out.println("|  Size           | Qty  |  Total    |");
		System.out.println("+-----------------+------+-----------+");
		for (int i = 0; i < sizes.length; i++) {
			System.out.printf("|  %-14s | %-4d | %-9.2f |\n", sizes[i], quantities[i], amounts[i]);
		}
		System.out.println("+-----------------+------+-----------+");
		System.out.println("\t\tTo acess the  Main Menu, please enter 0 :");
		int zero=input.nextInt();
        break;
		
		case 2:
		clearConsole();
		System.out.println("   _____            _           _   ____                                               _   ");
        System.out.println("  / ____|          | |         | | |  _ \\            /\\                               | |  ");
        System.out.println(" | (___   ___  _ __| |_ ___  __| | | |_) |_   _     /  \\   _ __ ___   ___  _   _ _ __ | |_ ");
        System.out.println("  \\___ \\ / _ \\| '__| __/ _ \\/ _` | |  _ <| | | |   / /\\ \\ | '_ ` _ \\ / _ \\| | | | '_ \\| __|");
        System.out.println("  ____) | (_) | |  | ||  __/ (_| | | |_) | |_| |  / ____ \\| | | | | | (_) | |_| | | | | |_ ");
        System.out.println(" |_____/ \\___/|_|   \\__\\___|\\__,_| |____/ \\__, | /_/    \\_\\_| |_| |_|\\___/ \\__,_|_| |_|\\__|");
        System.out.println("                                           __/ |                                           ");
        System.out.println("                                          |___/                                            ");
        System.out.println("------------------------------------------------------------------------------------------------------\n\n");
		String[] sizes1 = {"M", "XL", "XXL", "XS", "S", "L"};
					int[] quantities1 = new int[sizes1.length];
					double[] amounts1 = new double[sizes1.length];
					for (int i = 0; i < sizeArray.length; i++) {
						for (int j = 0; j < sizes1.length; j++) {
							if (sizeArray[i].equals(sizes1[j])) {
							 quantities1[j] += qtyArray[i];
							 amounts1[j] += amountArray[i];
							}
						}
					}
					for (int i = 0; i < amounts1.length - 1; i++) {
						for (int j = 0; j < amounts1.length - 1 - i; j++) {
							if (amounts1[j] < amounts1[j + 1]) {
								int tempQty = quantities1[j];
								quantities1[j] = quantities1[j + 1];
								quantities1[j + 1] = tempQty;
								String tempSize = sizes1[j];
								sizes1[j] = sizes1[j + 1];
								sizes1[j + 1] = tempSize;
								double tempAmount = amounts1[j];
								amounts1[j] = amounts1[j + 1];
								amounts1[j + 1] = tempAmount;
							}
					}
				}	
		System.out.println("+-----------------+------+-----------+");
		System.out.println("|  Size           | Qty  |  Total    |");
		System.out.println("+-----------------+------+-----------+");
		for (int i = 0; i < sizes1.length; i++) {
			System.out.printf("|  %-14s | %-4d | %-9.2f |\n", sizes1[i], quantities1[i], amounts1[i]);
		}
		System.out.println("+-----------------+------+-----------+");
		System.out.println("\t\tTo acess the  Main Menu, please enter 0 :");
		int zero1=input.nextInt();
        break;
		
		
		default:
        System.out.println("Invalid option. Please try again.");
         break;
		
	}		
	break;			
	    case 3:
		clearConsole();
		System.out.println("   ____          _             _____                       _       ");
        System.out.println("  / __ \\        | |           |  __ \\                     | |      ");
        System.out.println(" | |  | |_ __ __| | ___ _ __  | |__) |___ _ __   ___  _ __| |_ ___ ");
        System.out.println(" | |  | | '__/ _` |/ _ \\ '__| |  _  // _ \\ '_ \\ / _ \\| '__| __/ __|");
        System.out.println(" | |__| | | | (_| |  __/ |    | | \\ \\  __/ |_) | (_) | |  | |_\\__ \\");
        System.out.println("  \\____/|_|  \\__,_|\\___|_|    |_|  \\_\\___| .__/ \\___/|_|   \\__|___/");
        System.out.println("                                         | |                       ");
        System.out.println("                                         |_|                       ");	
        System.out.println("--------------------------------------------------------------------------\n\n");
        System.out.println("\t\t[1]All Orders \n");
		System.out.println("\t\t[2]Orders By Amount \n");
		System.out.print("Enter option : ");
		int opt2=input.nextInt();	
		switch(opt2){	
			case 1:
			clearConsole();
			System.out.println(" __      ___                  ____          _               ");
			System.out.println(" \\ \\    / (_)                / __ \\        | |              ");
			System.out.println("  \\ \\  / / _  _____      __ | |  | |_ __ __| | ___ _ __ ___ ");
			System.out.println("   \\ \\/ / | |/ _ \\ \\ /\\ / / | |  | | '__/ _` |/ _ \\ '__/ __|");
			System.out.println("    \\  /  | |  __/\\ V  V /  | |__| | | | (_| |  __/ |  \\__ \\");
			System.out.println("     \\/   |_|\\___| \\_/\\_/    \\____/|_|  \\__,_|\\___|_|  |___/");
			System.out.println("--------------------------------------------------------------------------\n\n");
			System.out.println("+---------+--------------+--------+------+------------+-----------+");
			System.out.println("| OrderID | Customer ID  |  Size  |  QTY |   Amount   |   Status  |");
			System.out.println("+---------+--------------+--------+------+------------+-----------+");
			for(int i=orderIdArray.length-1;i>=0;i--){
				 String statusMessage="";
				if (statusArray[i] == 0) {
					statusMessage = "Processing";
				} else if (statusArray[i] == 1) {
					statusMessage = "Delivering";
				} else if (statusArray[i] == 2) {
					statusMessage = "Delivered";
				}
				System.out.printf("|%-6s| %-12s |  %-5s | %-5d| %-9.2f  | %-7s| \n",orderIdArray[i],customerPhoneArray[i],sizeArray[i],qtyArray[i],amountArray[i],statusMessage);
			}
			System.out.println("+---------+--------------+--------+------+------------+-----------+");
			System.out.println("\n\n\t\tTo acess the  Main Menu, please enter 0 :");
			int zero1=input.nextInt();
			break;
			
			case 2:
			clearConsole();	
			System.out.println("   ____          _                 ____                                               _   ");
			System.out.println("  / __ \\        | |               |  _ \\            /\\                               | |  ");
			System.out.println(" | |  | |_ __ __| | ___ _ __ ___  | |_) |_   _     /  \\   _ __ ___   ___  _   _ _ __ | |_ ");
			System.out.println(" | |  | | '__/ _` |/ _ \\ '__/ __| |  _ <| | | |   / /\\ \\ | '_ ` _ \\ / _ \\| | | | '_ \\| __|");
			System.out.println(" | |__| | | | (_| |  __/ |  \\__ \\ | |_) | |_| |  / ____ \\| | | | | | (_) | |_| | | | | |_ ");
			System.out.println("  \\____/|_|  \\__,_|\\___|_|  |___/ |____/ \\__, | /_/    \\_\\_| |_| |_|\\___/ \\__,_|_| |_|\\__|");
			System.out.println("                                          __/ |                                           ");
			System.out.println("                                         |___/                                            ");
			System.out.println("--------------------------------------------------------------------------------------------------\n\n");
			System.out.println("+---------+--------------+--------+------+------------+-----------+");
			System.out.println("| OrderID | Customer ID  |  Size  |  QTY |   Amount   |   Status  |");
			System.out.println("+---------+--------------+--------+------+------------+-----------+");				
			for (int i = 0; i < amountArray.length - 1; i++) {
						for (int j = 0; j < amountArray.length - 1 - i; j++) {
							if (amountArray[j] < amountArray[j + 1]) {
								double tempAmount = amountArray[j];
								amountArray[j] = amountArray[j + 1];
								amountArray[j + 1] = tempAmount;
								String tempOrderId = orderIdArray[j];
								orderIdArray[j] = orderIdArray[j + 1];
								orderIdArray[j + 1] = tempOrderId;
								String tempCustomerId = customerPhoneArray[j];
								customerPhoneArray[j] = customerPhoneArray[j + 1];
								customerPhoneArray[j + 1] = tempCustomerId;
								String tempSize = sizeArray[j];
								sizeArray[j] = sizeArray[j + 1];
								sizeArray[j + 1] = tempSize;
								int tempQty = qtyArray[j];
								qtyArray[j] = qtyArray[j + 1];
								qtyArray[j + 1] = tempQty;
								int tempStatus = statusArray[j];
								statusArray[j] = statusArray[j + 1];
								statusArray[j + 1] = tempStatus;
								
							}
					}
				}
				for(int i=0;i<orderIdArray.length;i++){
				 String statusMessage="";
				if (statusArray[i] == 0) {
					statusMessage = "Processing";
				} else if (statusArray[i] == 1) {
					statusMessage = "Delivering";
				} else if (statusArray[i] == 2) {
					statusMessage = "Delivered";
				}
				System.out.printf("|%-6s| %-12s |  %-5s | %-5d| %-9.2f  | %-7s| \n",orderIdArray[i],customerPhoneArray[i],sizeArray[i],qtyArray[i],amountArray[i],statusMessage);
			}
			System.out.println("+---------+--------------+--------+------+------------+-----------+");
			System.out.println("\n\n\t\tTo acess the  Main Menu, please enter 0 :");
			int zero2=input.nextInt();
			break;
			
		}			
	    break;
		 	 
	 }
 	 break;
 
		case 5:
		clearConsole(); 
		boolean go=false;
		int times=0;
		String id1="";
		L2:while(go!=true){
		clearConsole();	
		System.out.println("   ____          _              _____ _        _             ");
        System.out.println("  / __ \\        | |            / ____| |      | |            ");
        System.out.println(" | |  | |_ __ __| | ___ _ __  | (___ | |_ __ _| |_ _   _ ___ ");
        System.out.println(" | |  | | '__/ _` |/ _ \\ '__|  \\___ \\| __/ _` | __| | | / __|");
        System.out.println(" | |__| | | | (_| |  __/ |     ____) | || (_| | |_| |_| \\__ \\");
        System.out.println("  \\____/|_|  \\__,_|\\___|_|    |_____/ \\__\\__,_|\\__|\\__,_|___/");
        System.out.println("----------------------------------------------------------------\n\n");
        if(times==0){
        System.out.print("Enter Order ID : ");	
	    id1=input.next();
	}
	    System.out.print("\n ");
        boolean isvalidorder1=false;
        int choice=0;
			  int s=0;
			for(s=0;s<orderIdArray.length;s++){
			 if(id1.equals(orderIdArray[s])){
			    System.out.println("\n\nPhone Number   : "+customerPhoneArray[s]); 
				System.out.println("Size           : "+sizeArray[s]);
				System.out.println("QTY            : "+qtyArray[s]);
				System.out.println("Amount         : "+amountArray[s]);
				if(statusArray[s]==0){
				System.out.println("Status         : "+"PROCESSING");
			}else if(statusArray[s]==1){
				System.out.println("Status         : "+"DELIVERING");	
			}else if(statusArray[s]==2){
				System.out.println("Status         : "+"DELIVERED");	
			}
				isvalidorder1=true;
				break;		 
			 } 
		 } 
		  if(isvalidorder1==false) {
				System.out.println("\n\n\n\t\tInvalid ID..  "); 
			}
			if(isvalidorder1==true) {
				System.out.print("\n\nDo you want to change this order status? (Y/N): ");
	            String place=input.next().toUpperCase(); 
	             if(place.equals("Y")){
					 if(statusArray[s]==0){
						System.out.print("\n\t\t[1]Order Delivering ");	
						System.out.print("\n\t\t[2]Order Delivered ");
						System.out.print("\n\nEnter option  :");
						choice=input.nextInt();
						statusArray[s]=choice;
						times++;
						continue L2;
					 }else if(statusArray[s]==1){
						System.out.print("\n\t\t[1]Order Delivered "); 
						System.out.print("\n\nEnter option  :");
						choice=input.nextInt();
						statusArray[s]=2;
						times++;
						continue L2;
					 }else{
						System.out.print("\n\n\t\tCan't change this order status,Order already delivered....! ");  
					 }
					 
				
				 }
			}
			System.out.print("\n\n\nDo you want to change another Order status? (Y/N): ");
	             String invalidinput1=input.next().toUpperCase();
                 if(invalidinput1.equals("Y")){
					isyes=true;
				}else{
					isyes=false;
					break;
					}
				} 
		break;  
		 case 6:
		 while(isyes){
			clearConsole(); 
			System.out.println("  _____       _      _          ____          _           ");
			System.out.println(" |  __ \\     | |    | |        / __ \\        | |          ");
			System.out.println(" | |  | | ___| | ___| |_ ___  | |  | |_ __ __| | ___ _ __ ");
			System.out.println(" | |  | |/ _ \\ |/ _ \\ __/ _ \\ | |  | | '__/ _` |/ _ \\ '__|");
			System.out.println(" | |__| |  __/ |  __/ ||  __/ | |__| | | | (_| |  __/ |   ");
			System.out.println(" |_____/ \\___|_|\\___|\\__\\___|  \\____/|_|  \\__,_|\\___|_|   "); 
			System.out.println("----------------------------------------------------------------");
			System.out.print("Enter Order ID : ");	
			 String id=input.next(); 
			  boolean isvalidorder=false;
			  int i=0;
			 for(i=0;i<orderIdArray.length;i++){
			 if(id.equals(orderIdArray[i])){
			    System.out.println("\n\nPhone Number   : "+customerPhoneArray[i]); 
				System.out.println("Size           : "+sizeArray[i]);
				System.out.println("QTY            : "+qtyArray[i]);
				System.out.println("Amount         : "+amountArray[i]);
				if(statusArray[i]==0){
				System.out.println("Status         : "+"PROCESSING");
			}else if(statusArray[i]==1){
				System.out.println("Status         : "+"DELIVERING");	
			}else if(statusArray[i]==2){
				System.out.println("Status         : "+"DELIVERED");	
			}
				isvalidorder=true;
				break;		 
			 } 
		 } 
		  if(isvalidorder==false) {
				System.out.println("\n\n\n\t\tInvalid ID..  "); 
			}
			if(isvalidorder==true) {
				System.out.print("\n\n\nDo you want to delete this order? (Y/N): ");
	            String place=input.next().toUpperCase(); 
	             if(place.equals("Y")){
					System.out.println("\n\n\n\t\tOrder Deleted..!  ");
					deleteCustomer(i); 
				 }
			}
			System.out.print("\n\n\nDo you want to delete another Order? (Y/N): ");
	             String invalidinput=input.next().toUpperCase();
                 if(invalidinput.equals("Y")){
					isyes=true;
				}else{
					isyes=false;
					break;
					} 
			 }
		default: 
		System.out.print("\t\tInvalid option\n\n\n");
		clearConsole();
		break;
	}	 
}
		 }	 
		}
	 
        

