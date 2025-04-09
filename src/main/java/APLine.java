public class APLine{
  private int myA,myB,myC;
  public APLine(int a,int b,int c){
    myA=a;
    myB=b;
    myC=c;
  }
  public double getSlope(){
    return -(double)myA/myB;
  }
  public boolean isOnLine(int x,int y){
    return myA*x+myB*y+myC==0;
  }
}
