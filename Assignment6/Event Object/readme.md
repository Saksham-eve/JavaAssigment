# Event Object
An event listener is an object that "listens" for events from a GUI component, like a button. An event, like a button click, is represented as an object. When the user generates an event, the system creates an event object which is then sent to the listener that has been registered for the GUI component. Then, a method in the listener object is invoked.
To be able to respond to events, a program must:
* Create an event listener object for the type of event.
* Register the listener object with the GUI component that generates the event (or with a component that contains it).

## Class declaration
Following is the declaration for java.util.EventObject class:
* public class EventObject
   extends Object
      implements Serializable

## Class Constructor
**EventObject** -  Constructs a prototypical Event

## Class methods
| **Method** | **Description**|
| --------------- | -------------------- |
|Object getSource() | The object on which the Event initially occurred. |
| String toString() | Returns a String representation of this EventObject. |
