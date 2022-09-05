package com.example.noteapp;

import java.util.ArrayList;
import java.util.Date;

public class Note
{
    public static ArrayList<Note> noteArrayList = new ArrayList<>();
    public static String NOTE_EDIT_EXTRA = "noteEdit";

    private int id;
    private String title;
    private String description;
    private String PDL;
    private String FDL;
    private Date deleted;

    public Note(int id, String title, String description, String PDL, String FDL, Date deleted) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.PDL = PDL;
        this.FDL = FDL;
        this.deleted = deleted;
    }

    public Note(int id, String title, String description, String PDL, String FDL) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.PDL = PDL;
        this.FDL = FDL;
        deleted = null;
    }

    public static Note getNoteForID(int passedNoteID)
    {
        for (Note note : noteArrayList)
        {
            if (note.getId() == passedNoteID)
                return note;
        }

        return null;
    }

    public static ArrayList<Note> nonDeletedNotes()
    {
        ArrayList<Note> nonDeleted = new ArrayList<>();
        for (Note note : noteArrayList)
        {
            if (note.getDeleted() == null)
                nonDeleted.add(note);
        }

        return nonDeleted;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getPDL() {
        return PDL;
    }

    public void setPDL(String PDL) {
        this.PDL = PDL;
    }

    public String getFDL() {
        return FDL;
    }

    public void setFDL(String FDL) {
        this.FDL = FDL;
    }
    public Date getDeleted() {
        return deleted;
    }

    public void setDeleted(Date deleted) {
        this.deleted = deleted;
    }
}
