
public class Animation extends Thread{

	private Oiseau o;
	private Decor d;
	private double v0,angle;
	private final double G = 9.81;
	
	public Animation(Oiseau o1, Decor d1, double v01, double angle1){
		o=o1;
		d=d1;
		v0=v01;
		angle=angle1;
	}
	
	public void run(){
		double t=0;
		while(o.get_Y()> 0){
			try{
				Main.getFenetre().revalidate();
				double rad = Math.toRadians(angle);
				
				double x = v0*Math.cos(rad)*t;
				o.set_X((int)(x*d.getEchelle()));
				

				double t1 = o.get_X()/(v0*Math.cos(rad));
				
				double y = (-(G/2))*t1*t1 + v0*Math.sin(rad)*t1 ;
				o.set_Y((int)(y)+ d.getHauteurLP()+(o.getHauteur()/2));
				

				o.placer(d.getPlan());
				sleep(10);
				t+=0.01;
			}catch(Exception e){
				
			}
		}
	}
}
