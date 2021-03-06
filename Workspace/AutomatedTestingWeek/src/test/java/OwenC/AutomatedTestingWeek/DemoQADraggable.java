package OwenC.AutomatedTestingWeek;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoQADraggable {

	@FindBy(css = "#ui-id-1")
	private WebElement defaultFunctionalityButton;

	@FindBy(css = "#ui-id-2")
	private WebElement constrainMovementButton;

	@FindBy(css = "#ui-id-3")
	private WebElement cursorStyleButton;

	@FindBy(css = "#ui-id-4")
	private WebElement eventsButton;

	@FindBy(css = "#ui-id-5")
	private WebElement draggableSortableButton;

	@FindBy(css = "#draggable")
	private WebElement draggable;

	@FindBy(css = "#draggabl > p")
	private WebElement onlyVerticalDrag;

	@FindBy(css = "#draggabl2 > p")
	private WebElement onlyHorizontalDrag;

	@FindBy(css = "#drag > p")
	private WebElement dragWillStayCentre;
	
	@FindBy (css = "#drag2 > p")
	private WebElement dragTopLeftOffset;
	
	@FindBy (css = "#drag3 > p")
	private WebElement dragBottom;

	public int getDraggableX() {
		return draggable.getLocation().x;
	}

	public int getDraggableY() {
		return draggable.getLocation().y;
	}

	public WebElement getDraggable() {
		return draggable;
	}

	public int getVertDraggableX() {
		return onlyVerticalDrag.getLocation().x;
	}

	public WebElement getVertDraggable() {
		return onlyVerticalDrag;
	}

	public int getHorizontalDraggableY() {
		return onlyHorizontalDrag.getLocation().y;
	}

	public WebElement getHorizontalDraggable() {
		return onlyHorizontalDrag;
	}

	public int getDragStayCentreX() {
		return dragWillStayCentre.getLocation().x;
	}

	public int getDragStayCentreY() {
		return dragWillStayCentre.getLocation().y;
	}

	public WebElement getDragStayCentre() {
		return dragWillStayCentre;
	}
	
	public WebElement getDragTopLeftOffset() {
		return dragTopLeftOffset;
	}
	
	public WebElement getDragBottom() {
		return dragBottom;
	}

	public void clickDefaultFunctionality() {
		defaultFunctionalityButton.click();

	}

	public void clickConstrainMovement() {
		constrainMovementButton.click();

	}

	public void clickCursorStyle() {
		cursorStyleButton.click();

	}

	public void clickEvents() {
		eventsButton.click();

	}

	public void clickDraggableSortable() {
		draggableSortableButton.click();

	}
}
