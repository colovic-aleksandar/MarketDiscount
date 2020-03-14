public class PayDesk {


 public static void Bronze(float to, float pv) {
  float dr, disc, total;
  if (to < 100) {
   dr = (float) 0;
  } else if (to >= 100 && to <= 300) {
   dr = (float) 1;
  } else {
   dr = (float) 2.5;
  }

  disc = pv * dr / 100;
  total = pv - disc;
  System.out.println("Purchase Value: $" + pv);
  System.out.println("Discount Rate: " + dr + "%");
  System.out.println("Discount: $" + disc);
  System.out.println("Total: $" + total);

 }

 public static void Silver(float to, float pv) {
  float dr, disc, total;
  if (to > 300) {
   dr = (float) 3.5;
  } else {
   dr = (float) 2;
  }

  disc = pv * dr / 100;
  total = pv - disc;
  System.out.println("Purchase Value: $" + pv);
  System.out.println("Discount Rate: " + dr + "%");
  System.out.println("Discount: $" + disc);
  System.out.println("Total: $" + total);

 }

 public static void Gold(float to, float pv) {

  float dr, disc, total;
  dr = 2;
  int p = (int) to / 100;

  if (to > 100) {
   dr += p;
   if (dr > 10) {
    dr = 10;
   }
  }
  disc = pv * dr / 100;
  total = pv - disc;

  System.out.println("Purchase Value: $" + pv);
  System.out.println("Discount Rate: " + dr + "%");
  System.out.println("Discount: $" + disc);
  System.out.println("Total: $" + total);

 }
}