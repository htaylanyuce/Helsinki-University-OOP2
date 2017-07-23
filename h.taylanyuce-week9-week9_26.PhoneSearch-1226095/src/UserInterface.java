
import addPersonalInformation.AddAddress;
import addPersonalInformation.AddNumber;
import java.util.*;
import searchInfo.SearchByKeyword;
import searchInfo.SearchForNumber;
import searchInfo.SearchForPerson;
import searchInfo.SearchPersonalInfo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cham
 */
public class UserInterface {
    private Scanner reader;
    private AddNumber addNumber;
    private AddAddress addAddress;
    private SearchForNumber searchForNum;
    private SearchForPerson searchHim;
    private SearchPersonalInfo searchInfo;
    private SearchByKeyword filterListing;
    private Set<String> nameList;
    
    public UserInterface(Scanner reader){
        this.reader = reader;
        this.nameList = new HashSet<String>();
        this.addNumber = new AddNumber();
        this.addAddress = new AddAddress();
    }
    
    public void start(){
        System.out.println("phone search");
        System.out.println("available operation:");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");
        System.out.println("");
        this.command();
    }
    
    public void command(){
        while(true){
            System.out.println("command: ");
            String comm = this.reader.nextLine();
            if (comm.equals("1"))
                this.addNumber();
            if (comm.equals("2"))
                this.searchForNum();
            if (comm.equals("3"))
                this.searchForGuy();
            if (comm.equals("4"))
                this.addAddress();
            if (comm.equals("5"))
                this.infoSearch();
            if (comm.equals("6"))
                this.deleteIt();
            if (comm.equals("7"))
                this.filterList();
            if (comm.equals("x"))
                break;
        }
    }
    
    
    public void addNumber(){
        System.out.println("whose number: ");
        String name = this.reader.nextLine();
        System.out.println("number: ");
        String number = this.reader.nextLine();
        this.nameList.add(name);
        this.addNumber.addName(nameList);
        this.addNumber.addIt(name, number);
    }
    
    public void searchForNum(){
        System.out.println("whose number: ");
        String name = this.reader.nextLine();
        this.searchForNum = new SearchForNumber(name, this.addNumber);
        this.searchForNum.searchIt();
    }
    
    public void searchForGuy(){
        System.out.println("number: ");
        String number = this.reader.nextLine();
        this.searchHim = new SearchForPerson(number, this.addNumber);
        this.searchHim.findHim();
    }
    
    public void addAddress(){
        String address = "";
        System.out.println("whose address: ");
        String name = this.reader.nextLine();
        if(!this.nameList.contains(name))
            this.nameList.add(name);
        System.out.println("street: ");
        String street = this.reader.nextLine();
        address += street;
        System.out.println("city: ");
        String city = this.reader.nextLine();
        address += " "+city;
        this.addAddress.addName(nameList);
        this.addAddress.addIt(name, address);
    }
    
    public void infoSearch(){
        System.out.println("whose information: ");
        String name = this.reader.nextLine();
        this.searchInfo = new SearchPersonalInfo(name, this.addAddress, this.addNumber, this.nameList);
        this.searchInfo.findIt();
    }
    
    public void deleteIt(){
        System.out.println("whose information: ");
        String name = this.reader.nextLine();
        if (this.nameList.contains(name)){
            this.nameList.remove(name);
            this.addAddress.getaddressStore().remove(name);
            this.addNumber.getPhoneStore().remove(name);
        }
    }
    
    public void filterList(){
        System.out.println("keyword (if empty, all listed): ");
        String keyWord = this.reader.nextLine();
        this.filterListing = new SearchByKeyword(keyWord, this.addAddress, this.addNumber, this.nameList);
        this.filterListing.findIt();
    }
}