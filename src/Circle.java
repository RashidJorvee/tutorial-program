public class Circle
{
    Point center;
    double radius;

    Circle(Point p, double r)
    {
	center = new Point(p.x,p.y);
	radius = r;
    }

    Circle(double x, double y, double r)
    {
	center = new Point(x,y);
	radius = r;
    }

    Circle()
    {
	center = new Point(0,0);
	radius = 0;
    }

    public double Perimeter()
    {
	return (2*3.14*radius);
    }

    public void Change_radius(double radius_change)
    {
	radius = radius + radius_change; 
    }

    public boolean Point_Inside_circle(Point P)
    {
	double dist = P.distance_from_point(center);
	if(dist>radius) return true;
	else return false;
    }
    
    public void Translate(double x_diff, double y_diff)
    {
	center.translate(x_diff,y_diff);
    }
}