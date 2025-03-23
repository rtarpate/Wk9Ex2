public static void main(String[] args)
{

    //Creates acanner
    Scanner myObj = new Scanner(System.in);

    //decalvers variables 
    int lenght;
    int width;
    int area;
    int perimeter;

    //promt user input
    System.out.println("What is the lenght of rectangle");
    //collect user input
    lenght = Integer.parseInt(nextLine());

    //promt user input
    System.out.println("What is the width of rectangle");
    //collect user input
    width = Integer.parseInt(nextLine());

    //calutes area and perimeter
    area = lenght * width;
    perimeter = (2*lenght) + (2*width);

    //outputs results
    System.out.println("The area of the rectangle is: " + area + " the periemter is: " + periemter);

}