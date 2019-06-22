package cg;
import java.util.*;
import java.io.*;
import com.cg.service.*;

import com.cg.bean.*;
public class Demo5 {

	public static void main(String[] args) throws IOException {
		Map<Long,Account> accmap=new TreeMap<Long,Account>();
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String choice ="";
		while(true)
		{
		System.out.println("Menu");
		System.out.println("==========");
		System.out.println("1.Create new Account");
		System.out.println("2.Print all accounts");
	    System.out.println("3.exit");
	    System.out.println("Enter your choice");
	    choice=br.readLine(); 
		switch(choice)
		{
		case "1":
			int id=0;
			long mb=0L;
			String ah="";
			double bal=0.0;
			//accpeting and validating input for account number
			System.out.println("Enter your account number");
			while(true)
			{
				String s_id=br.readLine();
				boolean ch1=Validator.validatedata(s_id,Validator.aidpattern);
				if(ch1==true)
				{
					try
					{
						id=Integer.parseInt(s_id);
						break;
					}
					catch(NumberFormatException e)
					{
						System.out.println("Account Number must be numeric. Re Enter");
					}
				}
				else
				{
					System.out.println("Re Enter Account number in 3 digits");
				}
			}//end of account number while
			//accepting and validating input for mobile number1
			System.out.println("Enter your mobile number");
			while(true)
			{
				String s_mb=br.readLine();
				boolean ch1=Validator.validatedata(s_mb,Validator.mobilepattern);
				if(ch1==true)
				{
					try
					{
						mb=Long.parseLong(s_mb);
						break;
					}
					catch(NumberFormatException e)
					{
						System.out.println("Mobile Number must be numeric. Re Enter");
					}
				}
				else
				{
					System.out.println("Re Enter Mobile number in 10 digits");
				}
			}
			//end of mobile number
			System.out.println("enter account holder name");
			ah=br.readLine();
			//accepting and validating balance
			System.out.println("enter your balance");
			String s_bal=br.readLine();
			bal=Double.parseDouble(s_bal);
			 Account ob=new Account(id,mb,ah,bal);
			 accmap.put(ob.getMobile(), ob);
			 
			
			
			
			break;
		case "2":
			Collection<Account> vc=accmap.values();
			List<Account>acclist=new ArrayList<Account>(vc);
			Collections.sort(acclist);
			for(Account o:acclist)
			{
				System.out.println(o);
				//service.printStatement(o);
			}
			break;
		case "3":
			System.out.println("Exiting program");
			System.exit(0);
			break;
			default:System.out.println("Invalid Choice");
		
		}
		}
		
		/*System.out.println(accmap);
		System.out.println(accmap.keySet());
		
		Collection<Account> vc=accmap.values();
		List<Account>acclist=new ArrayList<Account>(vc);
		Collections.sort(acclist);
		for(Account o:acclist)
		{
			System.out.println(o);
		}
		System.out.println("=======================sort by name");
		Comparator nc=new NameComparator();
		Collections.sort(acclist,nc);
		for(Account o :acclist)
		{
			System.out.println(o);
		}
		System.out.println("=======================sort by Balance");
		Comparator bc=new BalanceComparator();
		Collections.sort(acclist,bc);
		for(Account o :acclist)
		{
			System.out.println(o);
		}
		Set<Account> aset =new TreeSet<Account>();
		aset.add(Account object); //compare to method
		aset.add(Account object);
		
		//sort by name then
		 Comparator nc=new NameComparator();
		 
		 Set<Account> aset=new TressSetACcount>(nc);
		 	aset.add(Account object);
		 	aset.add(Account object);
		 
		 */
	}

}
