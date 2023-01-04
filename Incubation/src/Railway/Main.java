package Railway;
import java.util.Scanner;

public class Main {
	

	Tickets obj = new Tickets();
	static Booking obj1[] = new Booking[40];
	static int size = 0;
	static int pnr = 1;
	static int seatno = 1;
	static int pointer = 0;
	static int adulttickets = 0;
	static int alloted = 0;

	public void available() {

		System.out.println("UP : " + Tickets.upperberth);
		System.out.println("LP : " + Tickets.lowerberth);
		System.out.println("MP : " + Tickets.middleberth);
		System.out.println("RAC : " + Tickets.rac);
		System.out.println("Waiting : " + Tickets.waiting);
	}

	public void cancel(Scanner sc) {

		
		System.out.println("Enter the PNR");
		int count = 0, adult = 0;
		int rac = -1;
		int number = sc.nextInt();
		System.out.println("PNR\t ID\t Seat\t Name\t Age\t Berth\t Gender");
		for (int i = 0; i < size; i++) {
			if (obj1[i].pnr == number) {
				if (!obj1[i].berth.equals("-"))
					adult++;
				count++;
				System.out.println(obj1[i].pnr + "\t" + obj1[i].id + "\t" + obj1[i].seatnumber + "\t" + obj1[i].name
						+ "\t" + obj1[i].age + "\t" + obj1[i].berth + "\t" + obj1[i].gender);
			}
		}
		
		System.out.println("Choose the number of seats to cancel :");
		int choosen = sc.nextInt();
		int arr[] = new int[choosen];
		System.out.println("Enter the IDs");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("*");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < size; j++) {
				if (obj1[j].id == arr[i]) {
					
					
					if(obj1[j].berth.equals("UP")||obj1[j].berth.equals("LP")||obj1[j].berth.equals("MP"))
						{
						for (int racp = 0; racp < size; racp++) {
							if (obj1[racp].berth.equals("RAC")) {
								rac = racp;
								break;
							}
						
						}
						}
					 if(obj1[j].berth.equals("RAC"))
					{
						for (int racp = 0; racp < size; racp++) {
							if (obj1[racp].berth.equals("waiting")) {
								rac = racp;
								break;
							}
						
						}
						}
					
					
					if (obj1[j].age < 5) {
						for (int f = j; f < size - 1; f++) {
							obj1[f] = obj1[f + 1];

						}
						size--;
					}

					else if (rac != -1) {

						int temppnr = obj1[rac].pnr;
						int seatnum =obj1[rac].seatnumber;
						String berth=obj1[rac].berth;
						int rchild = 0;
						int it;
						for ( it = rac + 1;it<size; it++) {
							if(obj1[it].berth.equals("-"))
								rchild++;
							else break;

						}
						int child = rchild+1;
						int next =rac+rchild+1;
						int del=j+child;
						it=rac+rchild;
						Booking obcancel = new Booking();
						obcancel=obj1[j];
						while ((child) != 0) {
							Booking temp = new Booking();

							temp = obj1[it];

							for (int itt =it ; itt > j; itt--) {
								obj1[itt]=obj1[itt-1];
							}
							obj1[j]=temp;
							child--;
						}
						obj1[j].seatnumber=obcancel.seatnumber;
						obj1[j].berth=obcancel.berth;



						for (int k = next; k < size; k++) {
							if(!obj1[k].berth.equals("-")) {
									int cn=obj1[k].seatnumber;
									String cberth = obj1[k].berth;
									obj1[k].seatnumber=seatnum;
									obj1[k].berth=berth;
									seatnum=cn;
									berth = cberth;


								}	
						}
						for (int f = del; f < size - 1; f++) {
							obj1[f] = obj1[f + 1];
						}
						size--;

						if (obj.waiting <2) {
							obj.waiting++;
							obj.total++;
						}
						else if (obj.rac < 2) {
							obj.rac++;
							obj.total++;
						}

					}

					else
					{
						String berth = obj1[j].berth;
						for (int f = j; f < size - 1; f++) {
							obj1[f] = obj1[f + 1];

						}
						size--;
						if (berth.equals("UP")) {
							obj.upperberth++;
							obj.total++;
						} else if (berth.equals("MP")) {
							obj.middleberth++;
							obj.total++;
						} else {
							obj.lowerberth++;
							obj.total++;
						}
					}

				} 

			}
		}
		adult = 0;
		for (int i1 = 0; i1 < size; i1++) {
			if (obj1[i1].pnr == number) {
				if (!obj1[i1].berth.equals("-"))
					adult++;
			}
		}
		if (adult == 0) {
			for (int j1 = 0; j1 < size; j1++) {
				if (obj1[j1].pnr == number) {

					for (int f = j1; f < size - 1; f++) {
						obj1[f] = obj1[f + 1];

					}
					size--;
				}
				j1--;
			}
		}
	}
	public void book(Scanner sc) {
		System.out.println("Enter the No of tickets");
		int tickets = sc.nextInt();
		if (tickets > Tickets.total) {
			System.out.println("Tickets not available" + Tickets.total);
		} else {

			for (int i = 0; i < tickets; i++) {

				String berth = "-";
				System.out.println("Enter Name");
				String name = sc.nextLine();
				name = sc.nextLine();
				System.out.println("Enter age");
				int age = sc.nextInt();
				System.out.println("Enter Gender");
				String gender = sc.nextLine();
				gender = sc.nextLine();
				if (age > 4) {
					adulttickets++;
					System.out.println("Enter berth preference(UP/MP/LP");
					berth = sc.next();
					obj1[alloted] = new Booking();

					if (berth.equals("UP")) {
						if (Tickets.upperberth > 0) {
							Tickets.upperberth--;
							Tickets.total--;
							System.out.println("Upper Allocated");
						} else if (Tickets.middleberth > 0) {
							berth = "MP";
							Tickets.middleberth--;
							Tickets.total--;
							System.out.println("Middle Allocated");
						} else if (Tickets.lowerberth > 0) {
							berth = "LP";
							Tickets.lowerberth--;
							Tickets.total--;
							System.out.println("Lower Allocated");
						} else if (Tickets.rac > 0) {
							berth = "RAC";
							Tickets.rac--;
							Tickets.total--;
							System.out.println("In RAC");
						} else {
							berth = "waiting";
							Tickets.waiting--;
							Tickets.total--;
							System.out.println("In waiting");
						}

					} else if (berth.equals("MP")) {
						if (Tickets.middleberth > 0) {
							Tickets.middleberth--;
							Tickets.total--;
							System.out.println("Middle Allocated");
						} else if (Tickets.upperberth > 0) {
							berth = "UP";
							Tickets.upperberth--;
							Tickets.total--;
							System.out.println("Upper Allocated");
						} else if (Tickets.lowerberth > 0) {
							berth = "LP";
							Tickets.lowerberth--;
							Tickets.total--;
							System.out.println("Lower Allocated");
						} else if (Tickets.rac > 0) {
							berth = "RAC";
							Tickets.rac--;
							Tickets.total--;
							System.out.println("In RAC");
						} else {
							berth = "waiting";
							Tickets.waiting--;
							Tickets.total--;
							System.out.println("In waiting");
						}
					} else {
						if (Tickets.lowerberth > 0) {
							Tickets.lowerberth--;
							Tickets.total--;
							System.out.println("Lower Allocated");
						} else if (Tickets.upperberth > 0) {
							berth = "UP";
							System.out.println("Upper Allocated");
							Tickets.upperberth--;
							Tickets.total--;
						} else if (Tickets.middleberth > 0) {
							berth = "MP";
							Tickets.middleberth--;
							Tickets.total--;
							System.out.println("Middle Allocated");
						} else if (Tickets.rac > 0) {
							Tickets.rac--;
							berth = "RAC";
							Tickets.total--;
							System.out.println("In RAC");
						} else {
							Tickets.waiting--;
							berth = "waiting";
							Tickets.total--;
							System.out.println("In waiting");
						}
					}

					size++;
					obj1[alloted].set(alloted + 1, seatno, pnr, name, age, gender, berth);
					seatno++;
					alloted++;
				} else {
					obj1[alloted] = new Booking();
					obj1[alloted].set(alloted + 1, 0, pnr, name, age, gender, berth);
					size++;
					alloted++;
				}
			}
			System.out.println("Booked");
			System.out.println("Total : " + tickets * 50);
			pnr++;
		}
	}

	public void booked()
	{

		System.out.println("PNR\t ID\t Seat\t Name\t Age\t Berth\t Gender");
		for (int i = 0; i < size; i++)

		{

			System.out.println(obj1[i].pnr + "\t" + obj1[i].id + "\t" + obj1[i].seatnumber + "\t" + obj1[i].name + "\t"
					+ obj1[i].age + "\t" + obj1[i].berth + "\t" + obj1[i].gender);
		}
	}

	public static void main(String[] args) {

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println(
					"1.Book\n2.Cancel\n3.Print booked tickets\n4.Print available tickets\n5.Exit\nEnter your choice");
			int choice = sc.nextInt();
			Main o = new Main();
			switch (choice) {
			case 1: {

				o.book(sc);
			}
			break;
			case 2: {
				o.cancel(sc);
			}
			break;
			case 3: {
				o.booked();

			}
			break;
			case 4: {
				o.available();
			}
			break;
			case 5: {
				sc.close();
				return;
			}
			default:
				System.out.println("Enter valid choice");

			}

		}

	}

}
