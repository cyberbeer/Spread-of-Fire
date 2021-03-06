
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.ArrayList;
public class Draw extends JPanel{
 private ArrayList<ArrayList<Integer>> forest;
 private int rowcol;
 private int screenwidth;
 private int blocksize;
 public Draw(int rc,int scw,ArrayList<ArrayList<Integer>> f){
  rowcol=rc;
  screenwidth=scw;
  forest=f;
  blocksize=screenwidth/rowcol;
  rowcol*=blocksize;
 }

 @Override
 public void paintComponent(Graphics g){
  //super.paintComponent(g);
   revalidate();

   g.setColor(new Color(250,250,250));
   g.fillRect(0,0, 600,  600);
   
   g.setColor(Color.green);
   g.fillRect(0,0, rowcol,  rowcol);
  
      for (int i=0,l=0;i<rowcol && l<forest.size();i+=blocksize,l++ ) {
       for (int j=0,m=0;j<rowcol && m<forest.get(l).size() ;j+=blocksize,m++ ) {
        g.setColor(getColor(forest.get(l).get(m)));
        if(forest.get(l).get(m)!=1) {g.fillRect(i,j, blocksize, blocksize);}
        //g.fillRect(i,j, blocksize, blocksize);
       }
      }
  
 }

 public void reDrawBlock(){
  repaint();
 }

 private Color getColor(int num){
  /*if(num==1){
   return Color.green;
  }
  else if(num==2){return Color.red;}
  else{return Color.yellow;}*/
  return num==1 ? Color.green : (num==2 ? Color.red : Color.yellow);
 }
}