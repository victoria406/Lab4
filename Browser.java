package org.csci.labs;

import java.lang.reflect.Array;
import java.util.Objects;

/**
 * @author : Adiesha
 * @created : 7/21/2022, Thursday
 **/
public class Browser {

    // add the stacks needed
    Stack<String> back;
    Stack<String> forward;

    String currentPage;

    public Browser() {
        back = new LinkedStack<>();
        forward = new LinkedStack<>();
    }

    public Browser(String initialPage) {
        this();
        this.currentPage = initialPage;
    }


    public String back() {
        // should push the current page into the forward stack
        // should pop the latest value from back stack and update it as the current page
        if (this.back.top()==null){
            return null;
        }else{
            forward.push(currentPage);
            currentPage=back.pop();
            return currentPage;
        }
    }

    public String forward() {
        // should push the current page into the back stack
        // should pop the latest value from forward stack and update it as the current page
        if (this.forward.top()==null){
            return null;
        }else{
            back.push(currentPage);
            currentPage=forward.pop();
            return currentPage;
        }

    }

    public String visit(String page) {
        // go to page should empty the forward stack
        // push the current page to the back stack
        // update the current page to the new page

        forward.pop();// remove the object at the top of this stack and returns that object as the value of this function

        back.push(currentPage);

        currentPage=page;//current is now the page that calls the visit method
        return currentPage;
    }

    public String checkPreviousWebPage() {
        // should return the top most value in the back stack
        return back.top();
    }

    public String checkNextWebPage() {
        // should return the top most value in the forward stack
        return forward.top();
    }

}
