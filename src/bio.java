
public class bio 
{
	public static void bio_do(int line , int dot[][])
	{
		int i; int j; int sum; int m; int n; int random = 0;
		for(i=0;i<line;i++)
			for(j=0;j<line;j++)
			{
				sum =0;
			switch(dot[i][j])
			{
			case(0):
				//System.out.println(" i= " + i + " j= " + j);
				//System.out.println(sum);
			break;
			case(1):
					if(i==0||j==0||i==line-1||j==line-1)
					{
						if(i==0&&j==0)
						{
	
							//System.out.println(" i= " + i + " j= " + j);	
							for(m=0;m<2;m++)
							{
								for(n=0;n<2;n++)
									sum = sum + dot[m][n];
							}
							if(sum==2)
							{
								random = (int )(Math.random() * 4);
								while(random/2==0&&random%2==0)								//0=>0,0 1=>0,1 2=> 1,0 3=> 1,1
								{
									random = (int )(Math.random() * 4);
								}
								dot[random%2][random/2]=1;
							//System.out.print("new");
							}					
						}
					
					else
						if(i==line-1&&j==line-1)
						{
	
							//System.out.println(" i= " + i + " j= " + j);
							for(m=i-1;m<line;m++)
							{
								for(n=j-1;n<line;n++)
									sum = sum + dot[m][n];
							}
							if(sum==2)
							{
								random = (int )(Math.random() * 4);
								while(random/2==1&&random%2==1)								//0=>0,0 1=>0,1 2=> 1,0 3=> 1,1
								{
									random = (int )(Math.random() * 4);
								}
								dot[random%2 + line-2][random/2 + line-2]=1;
							//System.out.print("new");
							}
						}
					else
						if(i==0&&j==line-1)
						{
	
							//System.out.println(" i= " + i + " j= " + j);	
							for(m=0;m<2;m++)
							{
								for(n=j-1;n<line;n++)
									sum = sum + dot[m][n];
							}
							if(sum==2)
							{
								random = (int )(Math.random() * 4);
								while(random/2==0&&random%2==1)								//0=>0,0 1=>0,1 2=> 1,0 3=> 1,1
								{
									random = (int )(Math.random() * 4);
								}
								dot[random%2][random/2 + line-2]=1;
								//System.out.print("new");
							}				
						}
					else
						if(i==line-1&&j==0)
						{
	
							//System.out.println(" i= " + i + " j= " + j);
							for(m=i-1;m<line;m++)
							{
								for(n=0;n<2;n++)
									sum = sum + dot[m][n];
							}
							if(sum==2)
							{
								random = (int )(Math.random() * 4);
								while(random/2==1&&random%2==0)								//0=>0,0 1=>0,1 2=> 1,0 3=> 1,1
								{
									random = (int )(Math.random() * 4);
								}
								dot[random%2 + line - 2][random/2]=1;
								//System.out.print("new");
							}
						}	
					else
						if(i==0)
						{

							//System.out.println(" i= " + i + " j= " + j);
							for(m=0;m<2;m++)
							{
								for(n=j-1;n<j+2;n++)
									sum = sum + dot[m][n];
							}
							if(sum==2)
							{
								random = (int )(Math.random() * 6);
								while(random/2==0&&random%2==1)								//0=>0,0 1=>0,1 2=> 1,0 3=> 1,1
								{
									random = (int )(Math.random() * 6);
								}
								dot[random%2 + i][random/2 + j -1]=1;
								//System.out.print("new");
							}
						}							
					else
						if(j==0)
						{

							//System.out.println(" i= " + i + " j= " + j);
							for(m=i-1;m<i+2;m++)
							{
								for(n=0;n<2;n++)
									sum = sum + dot[m][n];	
							}
							if(sum==2)
							{
								random = (int )(Math.random() * 6);
								while(random/3==1&&random%3==0)								//0=>0,0 1=>0,1 2=> 1,0 3=> 1,1
								{
									random = (int )(Math.random() * 6);
								}
								dot[random%3 + i - 1][random/3 + j]=1;
								//System.out.print("new");
							}
						}
					else
						if(i==line-1)
						{

							//System.out.println(" i= " + i + " j= " + j);
							{
							for(m=i-1;m<line;m++)
								for(n=j-1;n<j+2;n++)
									sum = sum + dot[m][n];
							}
							if(sum==2)
							{
								random = (int )(Math.random() * 6);
								while(random/2==1&&random%2==1)								//0=>0,0 1=>0,1 2=> 1,0 3=> 1,1
								{
									random = (int )(Math.random() * 6);
								}
								dot[random%2 + i - 1][random/2 + j - 1]=1;
								//System.out.print("new");
							}
						}
					else
						if(j==line-1)
						{

							//System.out.println(" i= " + i + " j= " + j);
							{
							for(m=i-1;m<i+2;m++)
								for(n=j-1;n<line;n++)
									sum = sum + dot[m][n];	
							}
							if(sum==2)
							{
								random = (int )(Math.random() * 6);
								while(random/3==1&&random%3==1)								//0=>0,0 1=>0,1 2=> 1,0 3=> 1,1
								{
									random = (int )(Math.random() * 6);
								}
								dot[random%3 + i - 1][random/3 + j -1]=1;
								//System.out.print("new");
							}
						}
					}
				
				if(i!=0&&j!=0&&i!=line-1&&j!=line-1)
				{

					//System.out.println(" i= " + i + " j= " + j);
					for(m=i-1;m<i+2;m++)
					{
						for(n=j-1;n<j+2;n++)
						{
							sum = sum + dot[m][n];
						}
						
					}
					if(sum==2)
					{
						random = (int )(Math.random() * 9);
						while(random/3==1&&random%3==1)								//0=>0,0 1=>0,1 2=> 1,0 3=> 1,1
						{
							random = (int )(Math.random() * 9);
						}
						dot[random%3 + i -1][random/3 + j -1]=1;
						//System.out.print("new");
					}
				}
				if(sum>3)
				{
					dot[i][j]=0;
					System.out.print(" DIE ");
				}
				
				default: 
					break;
			}
		
			}		
		
		
		
		}
		
		
	}
	
