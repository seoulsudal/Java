package Bag;

public class Bag<T extends Solid> {

	private T thing;
	private String owner;

	public Bag(T thing) {
		this.thing = thing;
	}

	public T getThing() {
		return thing;
	}

	public void setThing(T thing) {
		this.thing = thing;
	}

	public void showType() { 
		System.out.println("Tė íėė " +	thing.getClass().getName());
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public boolean isSameOwner(Bag<?> obj) {
		if(this.owner.equals(obj.getOwner())) {
			return true;
		}
		return false;
	}
	
}
