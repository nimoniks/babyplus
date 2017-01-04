package net.nimonix.resources;

import java.io.File;

import com.vaadin.server.FileResource;
import com.vaadin.server.VaadinService;
import com.vaadin.ui.Image;

public class ImageResources
{

	public static void createResources()
	{
		// Find the application directory
		String basepath = VaadinService.getCurrent().getBaseDirectory().getAbsolutePath();

		// Create an Image from the FileResource

		// Babyplus Icon
		ImageResources.bpIconFile = new FileResource(new File(basepath + "/VAADIN/themes/img/babyplus_icon.png"));
		ImageResources.bpIcon = new Image(" ", ImageResources.bpIconFile);

	}

	private static final long serialVersionUID = 1L;

	private static Image bpIcon;

	public static FileResource bpIconFile;
}
