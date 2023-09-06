package support;

import pageObjects.Positioning;

public class PageInitializer {

   public static Positioning positioning=null;

   public static void Initialize(){
      positioning = new Positioning();
   }
}
