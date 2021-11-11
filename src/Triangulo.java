import java.lang.Math;
public class Triangulo {
 int la ;
 int lb ;
 int lc ;
 String triangulo ;
 Boolean a;
 public String verificaTriangulo (int la, int lb, int lc){
  a = (la + lb) > lc && lc > Math.abs(la - lb);
 
 
  if (a){
   if (la == lb && la == lc){
    triangulo = "equilatero";
   }
   else if (la == lb || la == lc || la == lc){
    triangulo = "isósceles";
   }
   else {
    triangulo = "escaleno";
   }
  }
  else{
   triangulo ="nao é um triangulo";
  }
 return triangulo;  
 }
}
