/* *************************************************************************
 
 IT Mill Toolkit 

 Development of Browser User Interfaces Made Easy

 Copyright (C) 2000-2006 IT Mill Ltd
 
 *************************************************************************

 This product is distributed under commercial license that can be found
 from the product package on license.pdf. Use of this product might 
 require purchasing a commercial license from IT Mill Ltd. For guidelines 
 on usage, see licensing-guidelines.html

 *************************************************************************
 
 For more information, contact:
 
 IT Mill Ltd                           phone: +358 2 4802 7180
 Ruukinkatu 2-4                        fax:   +358 2 4802 7181
 20540, Turku                          email:  info@itmill.com
 Finland                               company www: www.itmill.com
 
 Primary source for information and releases: www.itmill.com

 ********************************************************************** */

package com.itmill.toolkit.demo.features;

import com.itmill.toolkit.terminal.ClassResource;
import com.itmill.toolkit.ui.Component;
import com.itmill.toolkit.ui.Embedded;
import com.itmill.toolkit.ui.Form;
import com.itmill.toolkit.ui.Label;
import com.itmill.toolkit.ui.OrderedLayout;
import com.itmill.toolkit.ui.Panel;
import com.itmill.toolkit.ui.Select;

public class IntroComponents extends Feature {

	private static final String INTRO_TEXT = ""
			+ "This picture summarizes the relations between different user interface (UI) components."
			+ "<br /><br />See API documentation below for more information.";

	public IntroComponents() {
		super();
	}

	protected Component getDemoComponent() {

		OrderedLayout l = new OrderedLayout();

		Panel panel = new Panel();
		panel.setCaption("UI component diagram");
		l.addComponent(panel);

		Label label = new Label();
		panel.addComponent(label);

		label.setContentMode(Label.CONTENT_XHTML);
		label.setValue(INTRO_TEXT);

		panel.addComponent(new Embedded("", new ClassResource("components.png",
				this.getApplication())));

		// Properties
		propertyPanel = new PropertyPanel(panel);
		Form ap = propertyPanel.createBeanPropertySet(new String[] { "width",
				"height" });
		Select themes = (Select) propertyPanel.getField("style");
		themes.addItem("light").getItemProperty(
				themes.getItemCaptionPropertyId()).setValue("light");
		themes.addItem("strong").getItemProperty(
				themes.getItemCaptionPropertyId()).setValue("strong");
		propertyPanel.addProperties("Panel Properties", ap);

		setJavadocURL("ui/package-summary.html");

		return l;
	}

	protected String getExampleSrc() {
		return null;
	}

	/**
	 * @see com.itmill.toolkit.demo.features.Feature#getDescriptionXHTML()
	 */
	protected String getDescriptionXHTML() {
		return null;
	}

	protected String getImage() {
		return null;
	}

	protected String getTitle() {
		return null;
	}

}
