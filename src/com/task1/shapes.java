
    package com.task1;

    public class shapes {
        enum Shapes{
            square,
            rectangle,
            circle,
            trapezoid,
            rhombus,
            triangle,
            oval,
            hexagon
        }
        static class Display{
            Shapes zzz =  Shapes.square;
            void changeShape(){
                switch(zzz) {
                    case square:
                        zzz = shapes.Shapes.rectangle;
                        break;
                    case rectangle:
                        zzz = shapes.Shapes.circle;
                        break;
                    case circle:
                        zzz = shapes.Shapes.trapezoid;
                        break;
                    case trapezoid:
                        zzz = shapes.Shapes.rhombus;
                        break;
                    case rhombus:
                        zzz = shapes.Shapes.triangle;
                        break;
                    case triangle:
                        zzz = shapes.Shapes.oval;
                        break;
                    case oval:
                        zzz = shapes.Shapes.hexagon;
                        break;
                    case hexagon:
                        zzz = shapes.Shapes.square;
                        break;
                }

            }
            public String toString(){
                return ""+zzz;
            }
        }
        public static void main(String[] args){
            Display ww = new Display();
            for (int i = 0; i < 10 ; i++) {
                System.out.println(ww);
                ww.changeShape();

            }

        }


    }

