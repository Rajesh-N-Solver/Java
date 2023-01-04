package Hospital;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		Connection connection = DBConnection.get_Connection("Rajesh", "rajesh17");

		while (true) {
			System.out.println("\n1.Register\n2.Total Out Patinet\n3.Exit\nEnter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter Patient Name : ");
				String patient_name = sc.nextLine();
				patient_name = sc.nextLine();
				System.out.println("Enter Mobile Number : ");
				long patient_number = sc.nextLong();
				if (HospitalDB.RegisteredOrNot(patient_name, patient_number, connection)) {
					int patientID = HospitalDB.getPatientID(patient_name, patient_number, connection);
					HospitalDB.updateStatus(patientID, connection);
				} else {
					HospitalDB.Register(patient_name, patient_number, connection);
					int patientId = HospitalDB.getPatientID(patient_name, patient_number, connection);
					HospitalDB.updateStatus(patientId, connection);
				}
			}
				break;
			case 2: {
				System.out.println("PatientID   IntTime  DoctorTime  OutTime  WaitingTime  Status");
				HospitalDB.showStatus(connection);
			}
				break;
			case 3:
				return;
			default: {
				System.out.println("Enter valid choice");
			}
			}

		}

	}

}
