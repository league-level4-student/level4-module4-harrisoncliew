package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	
	List<Doctor> doctors = new ArrayList <Doctor>();
	List<Patient> patients = new ArrayList<Patient>();

	public void addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		doctors.add(doctor);
	}

	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return doctors;
	}

	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		patients.add(patient);
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		int patientIndex = 0;
		for (int i = 0; i < doctors.size(); i++) {
				while(doctors.get(i).getPatients().size()<3&&patientIndex<patients.size()) {
					
						try {
							doctors.get(i).assignPatient(patients.get(patientIndex));
						} catch (DoctorFullException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						patientIndex++;
					
					
				}
				
			}
	}
}
			
			
		
