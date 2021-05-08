package com.fcfm.service;

import java.util.List;

import com.fcfm.entity.Contact;
import com.fcfm.model.ContactModel;

public interface ContactService {

    public abstract ContactModel addContact(ContactModel contactModel);
    public abstract List<ContactModel> listAllContact();
    public abstract Contact findContactById(int id);
    public abstract void removeContact(int id);
    public abstract ContactModel findContactModelById(int id);
}