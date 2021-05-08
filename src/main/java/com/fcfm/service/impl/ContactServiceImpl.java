package com.fcfm.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.fcfm.component.ContactConverter;
import com.fcfm.entity.Contact;
import com.fcfm.model.ContactModel;
import com.fcfm.repository.ContactRepository;
import com.fcfm.service.ContactService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("contactServiceImpl")
public class ContactServiceImpl implements ContactService {

    @Autowired
    @Qualifier("contactRepository")
    private ContactRepository contactRepository;

    @Autowired
    @Qualifier("contactConverter")
    private ContactConverter contactConverter;

    public ContactModel addContact(ContactModel contactModel) {
        Contact contact = contactRepository.save(contactConverter.modelToEntity(contactModel));
        return contactConverter.entityToModel(contact);
    }

    //@PreAuthorize("permitAll()")
    @Override
    public List<ContactModel> listAllContact() {
        List<Contact> contacts = contactRepository.findAll();
        List<ContactModel> contactsModel = new ArrayList<ContactModel>();
        for (Contact contact : contacts) {
            contactsModel.add(contactConverter.entityToModel(contact));
        }
        return contactsModel;
    }

    @Override
    public Contact findContactById(int id) {
        return contactRepository.findById(id);
    }

    @Override
    public ContactModel findContactModelById(int id){
        return contactConverter.entityToModel(findContactById(id));
    }

    @Override
    public void removeContact(int id) {
        Contact contact = findContactById(id);
        if(contact != null){
            contactRepository.delete(contact);
        }        
    }


}