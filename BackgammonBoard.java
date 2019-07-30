public class BackgammonBoard {
		    public static final int POINTS_ON_BOARD = 24;
		    public static final int LAST_POINT = 23;
		    public static final int MAX_MOVE = 6;
		    public static final int MIN_MOVE = 1;
		    private int[] points = new int[24];
		    private int blacksOnBar = 0;
		    private int whitesOnBar = 0;
				
	
		public int getPointCount(int point) {
			if (point>=0&&point<=23){return Math.abs(this.points[point]);}
			else {return 0;}
		}
		
public boolean getPointBlack(int point){
	if (0<=point && point<=23)
		if(this.points[point]> 0)
		{return false;}
		else{return true;}
	else{return false;}
		}

public void setPoint(int point, int count, boolean black)
{
	if (0<=point && point<=23) {
		this.points[point]=count * (black ? -1 : 1);}
	}

public int getBarBlackCount() {
	 return this.blacksOnBar;	
}

public int getBarWhiteCount(){
	 return this.whitesOnBar;	
}

public void move(int fromPoint, int toPoint){
	if (-1<fromPoint&&fromPoint<24 && -1<toPoint&&toPoint<24&&fromPoint-toPoint>0 && fromPoint-toPoint<7 && getPointBlack(fromPoint)==true && getPointBlack(toPoint)==true&&getPointCount(toPoint)!=0)
	{points[fromPoint]=points[fromPoint]+1 ;
	points[toPoint]=points[toPoint]-1 ;}
	
	if (-1<fromPoint&&fromPoint<24 && -1<toPoint&&toPoint<24&& toPoint-fromPoint<7 &&toPoint-fromPoint>0 && getPointBlack(fromPoint)==false && getPointBlack(toPoint)==false&&getPointCount(toPoint)!=0 )
	{points[fromPoint]=points[fromPoint]-1 ;
	points[toPoint]=points[toPoint]+1 ;}
	
	if (-1<fromPoint&&fromPoint<24 && -1<toPoint&&toPoint<24&& fromPoint-toPoint<7 && fromPoint-toPoint>0&& getPointBlack(fromPoint)==true && getPointBlack(toPoint)==false && getPointCount(toPoint)<2&&getPointCount(toPoint)!=0)
	{points[fromPoint]=points[fromPoint]+1;
		whitesOnBar=whitesOnBar+1;
			points[toPoint]=-1 ;}
	
	if (-1<fromPoint&&fromPoint<24 && -1<toPoint&&toPoint<24&&toPoint-fromPoint>0 && toPoint-fromPoint<7 && getPointBlack(fromPoint)==false && getPointBlack(toPoint)==true && getPointCount(toPoint)<2&&getPointCount(toPoint)!=0)
	{points[fromPoint]=points[fromPoint]-1;
		blacksOnBar=blacksOnBar+1;
	points[toPoint]=1 ;}
	
	if (-1<fromPoint&&fromPoint<24 && -1<toPoint&&toPoint<24&&fromPoint-toPoint>0 && fromPoint-toPoint<7 && getPointBlack(fromPoint)==true &&  getPointCount(toPoint)==0)
	{points[fromPoint]=points[fromPoint]+1 ;
	points[toPoint]=-1 ;}
	
	if (-1<fromPoint&&fromPoint<24 && -1<toPoint&&toPoint<24 &&toPoint-fromPoint>0&& toPoint-fromPoint<7 && getPointBlack(fromPoint)==false && getPointCount(toPoint)==0)
	{points[fromPoint]=points[fromPoint]-1 ;
	points[toPoint]=1 ;}
}

}