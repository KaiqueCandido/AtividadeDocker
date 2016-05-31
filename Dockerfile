FROM payara/server-full
ENV DOMAIN domain1
ENV LIB /opt/payara41/glassfish/domains/${DOMAIN}/lib/
ADD target/AtividadeDocker/WEB-INF/lib/ ${LIB}
ADD target/AtividadeDocker.war /tmp/
ADD src/main/setup/glassfish-resources.xml /tmp/
ENTRYPOINT $PAYARA_PATH/bin/asadmin start-domain --verbose ${DOMAIN}
RUN $PAYARA_PATH/bin/asadmin start-domain ${DOMAIN_NAME} && \
    $PAYARA_PATH/bin/asadmin --user admin --passwordfile=/opt/pwdfile add-resources /tmp/glassfish-resources.xml && \
    $PAYARA_PATH/bin/asadmin --user admin --passwordfile=/opt/pwdfile deploy /tmp/AtividadeDocker.war && \
    $PAYARA_PATH/bin/asadmin stop-domain ${DOMAIN_NAME}
