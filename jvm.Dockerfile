FROM wildfly/wildfly-sql:1.0.0

# Change User to modify war owner
#USER root

# deploy app
ADD target/*.war "$JBOSS_HOME/standalone/deployments/"

# Modify war owner to jboss
#RUN chown jboss:jboss $JBOSS_HOME/standalone/deployments/*.war

#Change the user
USER jboss