import groovy.json.JsonSlurper

def call(trigger_cause) {
   def jsonSlurper = new JsonSlurper()
   def mock_cause = jsonSlurper.parseText('event:[eventKey:pr:opened, date:2019-06-28T16:06:20-0400, actor:[name:bjones, emailAddress:Bob.Jones@acme.com, id:9655, displayName:Jones, Bob, active:true, slug:bjones, type:NORMAL], pullRequest:[id:5, version:0, title:Develop, description:* prepping for pr, state:OPEN, open:true, closed:false, createdDate:1561752380873, updatedDate:1561752380873, fromRef:[id:refs/heads/develop, displayId:develop, latestCommit:bad7962404664aaf5c5a4a5f31fccd011dc72e03, repository:[slug:jenkins-bitbucket-pr-example, id:7489, name:jenkins-bitbucket-pr-example, scmId:git, state:AVAILABLE, statusMessage:Available, forkable:true, project:[key:DEVOPSLAB, id:482, name:DevOps Lab, description:Hosts the DevOp team, public:true, type:NORMAL], public:false]], toRef:[id:refs/heads/master, displayId:master, latestCommit:4379d9bf72ea7f149c4b07e8233f32233502c01c, repository:[slug:jenkins-bitbucket-pr-example, id:7489, name:jenkins-bitbucket-pr-example, scmId:git, state:AVAILABLE, statusMessage:Available, forkable:true, project:[key:DEVOPSLAB, id:482, name:DevOps Lab, description:Hosts the repos, public:true, type:NORMAL], public:false]], locked:false, author:[user:[name:bjones, emailAddress:Bob.Jones@acme.com, id:9655, displayName:Jones, Bob, active:true, slug:mklug, type:NORMAL], role:AUTHOR, approved:false, status:UNAPPROVED], reviewers:[], participants:[]]], shortDescription:Triggered by event]]')
   echo "Event Key: ${mock_cause[0].event}"
   //def ourCount = trigger_cause.size()
   return "2" //ourCount
}
