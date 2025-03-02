


class Cpu 
{
   int price=120000;
    class  Processor
    {
  	 int no_cores=1000;
	 String manufactur="microsoft";
	static class Ram
		{
		int memory=16;
		String manufactur1="intel";
		}
     }
}
	
		

class Main {
    public static void main(String[] args)
    {
      Cpu cp=new Cpu();
      Cpu.Processor in =cp.new Processor();
      Cpu.Processor.Ram ra=new Cpu.Processor.Ram();
      
     System.out.println("Price:"+ cp.price);
     
     System.out.println("No_Cores:"+in.no_cores);
     System.out.println("Manufacture:"+in.manufactur);
     
     System.out.println("Memory:"+ra.memory);
     System.out.println("Manufacture of ram:"+ra.manufactur1);
     
     }}
     
     
     
     
      
   
