public class CommandLine{
	public static void main(String[] args){
		double [] array = new double[args.length];
		for(int i = 0; i<args.length; i++){
			array[i] = Double.parseDouble(args[i]);
 		}

		double sum = 0;
		for(double values: array){
			sum += values;
		}

		System.out.println(sum);
		
	}

}
