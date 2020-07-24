package _04_hospital;

import java.util.List;

public class Doctor {

	int numOfPatients = 0;

	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}

	public void assignPatient(Patient patient) throws DoctorFullException {
		// TODO Auto-generated method stub
		Hospital h = new Hospital();
		if(h.getPatients().size()==3){
			throw new DoctorFullException();
		} else {
			h.addPatient(patient);
		}
		
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return null;
	}

	public void doMedicine() {
		// TODO Auto-generated method stub
		
	}

	

}
