public class EmpWagePerMonth
{
	public static final int IS_FULL_TIME=1;
        public static final int IS_PART_TIME=2;
        public static final int EMP_RATE_PER_HR=100;
	public static final int NUM_OF_WORKING_DAYS=20;

	public static void main(String[] args)
	{
	int empHrs=0;
	int empWage=0, totalempWage=0;
	for(int day=1;day<=NUM_OF_WORKING_DAYS;day++){
		double empCheck=Math.floor(Math.random()*10)%3;
		switch((int)empCheck)
		 {
		  case IS_FULL_TIME:
	      		   empHrs=8;
			      break;

  	         case IS_PART_TIME:
	    	          empHrs=4;
		             break;
	        default:

			empHrs=0;
	        }
		empWage=empHrs*EMP_RATE_PER_HR;
		totalempWage+=empWage;
		System.out.println("employee wage on day " + day + " is : " + empWage);
	}
		System.out.println("Employee wage per Month " +totalempWage);
}
}
