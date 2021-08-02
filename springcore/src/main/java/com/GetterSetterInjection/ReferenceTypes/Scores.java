package com.GetterSetterInjection.ReferenceTypes;

public class Scores {
	private int maths;
	private int physics;
	private int chemistry;
	private int biology;

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getBiology() {
		return biology;
	}

	public void setBiology(int biology) {
		this.biology = biology;
	}

	@Override
	public String toString() {
		return "[Maths=" + maths + ", Physics=" + physics + ", Chemistry=" + chemistry + ", Biology=" + biology
				+ "]";
	}

}
