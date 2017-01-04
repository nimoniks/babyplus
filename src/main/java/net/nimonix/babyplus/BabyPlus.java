package net.nimonix.babyplus;

import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import net.nimonix.resources.ImageResources;

public class BabyPlus extends VerticalLayout
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BabyPlus()
	{
		ImageResources.createResources();

		setMargin(true);
		setSpacing(true);

		initLayout();
	}

	HorizontalLayout horizontalLayout;

	void initLayout()
	{
		Label label = new Label("");
		// label.setStyleName("boldtext");
		label.setIcon(ImageResources.bpIconFile);

		addComponent(label);
	}
}
