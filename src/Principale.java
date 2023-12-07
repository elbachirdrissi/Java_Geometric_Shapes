import java.util.*;

public class Principale {
	public static void main(String args[]) {
		Forme form1;
		Cercle cercle1;
		cercle1 = new Cercle(5, 4, (float)3.5);
		cercle1.setRayon(10);
		/*System.out.println(cercle1.toString());
		System.out.print("La surface de cercle 1 est: "+cercle1.surface());*/
		
		Rectangle rectangle1;
		rectangle1 = new Rectangle(5,4,7,8);
		rectangle1.setLargeur(9);
		rectangle1.setLongueur(8);
		rectangle1.deplacer(-2.5, -0.5);
		/*System.out.println(rectangle1.toString());
		System.out.println("La surface de rectangle1 est: "+rectangle1.surface());*/
		
		
		Rectangle rectangle2 = new Rectangle();
		Cercle cercle2 = new Cercle();
		
		ArrayList<Forme> list = new ArrayList<Forme>();
		list.add(rectangle1);
		list.add(rectangle2);
		list.add(cercle1);
		list.add(cercle2);
		
		Iterator<Forme> itr = list.iterator();
		while(itr.hasNext()) {
			Forme form = itr.next();
			System.out.println("La surface de ce forme est: "+form.surface());
		}
		

		
		/* 
		cercle1 = rectangle1; ---> il y a un différence de type entre Rectangle et cercle
		rectangle1 = cercle1  ---> il y a un différence de type entre Rectangle et cercle
		rectangle1 = form1;   ---> La classe forme est abstraite, il ne peut pas instancié
		cercle1 = form1;      ---> La classe forme est abstraite, il ne peut pas instancié
		*/
		form1 = rectangle1; // On peut affecter un objet de la classe Rectangle au superclasse Form,
							// par ce que Rectangle hérite de Form
		form1 = cercle1;
	}
}
