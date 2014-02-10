/**
 *  Cette classe représente une lampe
 * @author dugandq
 */

public class Bulb
{
public static final int DEFAULT_POWER=100;

/**
 * La puissance de la lampe 
 */
private final int power;

private boolean islit;

public Bulb ()
{
	this.power= 100;
	this.islit=false;
}

public Bulb (int p0)
{
	this.power= p0;
}

public void switchOn()
{
 this.islit=true;
}

public void switchOff()
{
 this.islit=false;
}

}
