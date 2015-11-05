package leaveregister

class Event {

    String type
    Date startTime
    Date endTime

    static belongsTo = [person: Person]

    static constraints = {
    }
}
