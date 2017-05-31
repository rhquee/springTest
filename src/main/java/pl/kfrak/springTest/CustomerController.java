package pl.kfrak.springTest;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-05-31.
 */
public class CustomerController {

    /**
     * CustomerController
     */
    List<Customer> customers = new ArrayList<>();


    @RequestMapping(method = RequestMethod.GET, value = "/customer")
    @ResponseBody
    public Customer customer() {
        return new Customer(0, "Adam", "Adaś", "90909");
    }

    //GET /customers
    @RequestMapping(method = RequestMethod.GET, value = "/customers")
    @ResponseBody
    public List<Customer> customers() {
        return customers;
    }

    //GET /customer/{id}
    @RequestMapping(method = RequestMethod.GET, value = "/customer/{id}")
    @ResponseBody
    public Customer getCustomer(@PathVariable int id) {
        return null;
    }

    //DELETE /customer/{id}
    
    //PUT /customer/{id}

    //POST /customer
    @RequestMapping(method = RequestMethod.POST, value = "/customer")
    @ResponseBody
    public void addCustomer(@RequestBody Customer customer) {
        customers.add(customer);

    /**
     * </CustomerController
     *
     *
     * GET /customers
     * GET /customer/{id}
     * POST /customer
     * DELETE /customer/{id}
     * PUT /customer/{id}
     */



}