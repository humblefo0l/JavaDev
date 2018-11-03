package com.gaurav;


public abstract class ListItem {
    protected ListItem rightLink = null;
    protected ListItem leftLink = null;

    protected Object value;

    public ListItem(Object value){
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem setnext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setprevious(ListItem item);

    abstract int compareTo(ListItem item);

    public Object getValue(){
        return this.value;
    }

    public void setValue(Object value){
        this.value = value;
    }
}
