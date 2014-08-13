
public class Background 
{
	public static int line=5;
	public static int face[]= new int[line*line];
	public static int dot[][]= new int [line][line];
	public static int sample = 13;
	
	public static void main(String[] args)
	{
		int i; int j;int random; int temp; int k; int sum=0;
		for(i=0;i<line;i++)
			for(j=0;j<line;j++)
				dot[i][j] = 0;
		
		for(i=0;i<line*line;i++)
				face[i] = i;
		
		for(j = 0; j<line*line; j++)
        {
            random = (int )(Math.random() * (line*line-j));    
            temp = face[random];
            face[random] =  face[line*line-1-j] ; 
            face[line*line-1-j] = temp;            
        }

		for(i=0;i<sample;i++)
			dot[ face[i] %line][ face[i] /line] = 1;
		for(k=0;k<10;k++)	
		{
			sum = 0;
			for(i=0;i<line;i++)
			{
				for(j=0;j<line;j++)
				{
					System.out.print(dot[i][j]);
					if(dot[i][j]==1)
						sum = sum + 1;
				}
				System.out.println("");
			}
			bio.bio_do(line, dot);	
			
			System.out.println(" ");
			System.out.println(" sum= " + sum);
			System.out.println(" ");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
