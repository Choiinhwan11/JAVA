package bitcampTest;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeSort implements Employee{
	@Override
	public void excute(ArrayList<EmployeeDTO> list) {
		Collections.sort(list);
	}
}
