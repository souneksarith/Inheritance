package Inheritance;
    public class Rectangle{
        private double width;
        private double length;
        public Rectangle(double width, double length){
            this.length = length;
            this.width = width;
        }
        public double getArea(){
            return width * length;
        }
        public double getPerimeter(){
            return (width + length) * 2;
        }
    }
