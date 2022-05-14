
public class Minge {

	private int X;
	private int Y;

	private CoordinateGenerator CG = new CoordinateGenerator();

	public Minge(int x, int y) {
		super();
		X = x;
		Y = y;
	}

	public int getX() {
		return X;
	}

	public int getY() {
		return Y;
	}

	public void setX(int x) {
		X = x;
	}

	public void setY(int y) {
		Y = y;
	}

	public void suteaza() {
		try {

			int x = CG.generateX();
			int y = CG.generateY();

			if ((x == 0) && (y > 0 && y < 20))
				throw new Gol(1);

			else if ((x == 100) && (y > 0 && y < 20))
				throw new Gol(2);
			else if (y == 50 || y == 0)
				throw new Out();

			else

			if (x == 0 || x == 100)
				throw new Corner();

			else {

				this.X = x;
				this.Y = y;
			}

		}

		catch (Gol gol) {

			Minge minge;

			if (gol.getMessage() == "Echipa1")

			{
				minge = new Minge(50, 25);
				System.out.println("Gol");

			}

		} catch (Out out) {

			Minge minge = new Minge(this.X, this.Y);

			System.out.println("Out");
		}

		catch (Corner corner) {

			Minge minge = new Minge(this.X, this.Y);
			if (this.X == 0 && this.Y > 0 && this.Y < 20)

			{
				minge.setX(0);
				minge.setY(0);
			} else

			if (this.X == 0 && this.Y > 30 && this.Y < 50)

			{
				minge.setX(0);
				minge.setY(50);
			}

			if (this.X == 100 && this.Y > 0 && this.Y < 20)

			{
				minge.setX(100);
				minge.setY(0);
			}

			if (this.X == 100 && this.Y > 30 && this.Y < 50)

			{
				minge.setX(100);
				minge.setY(50);
			}

			System.out.println("Corner: " + minge.X + ", " + minge.Y);
		}
	}
}
